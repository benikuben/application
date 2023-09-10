package ru.neoflex.application.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.neoflex.application.feignclient.DealClient;
import ru.neoflex.openapi.dtos.LoanApplicationRequest;
import ru.neoflex.openapi.dtos.LoanOffer;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicationServiceImpl implements ApplicationService {
    private final DealClient dealClient;

    @Override
    public List<LoanOffer> createApplication(LoanApplicationRequest loanApplicationRequestDTO) {
        log.info("Sending request to /deal/application. Generating offers for client {} {}", loanApplicationRequestDTO.getFirstName(), loanApplicationRequestDTO.getLastName());
        List<LoanOffer> offers = dealClient.createApplication(loanApplicationRequestDTO).getBody();
        log.info("Offers generated : {}", offers);
        return offers;
    }

    @Override
    public void applyOffer(LoanOffer loanOfferDTO) {
        log.info("Sending request to /deal/offer. Saving applied offer with id {} in database", loanOfferDTO.getApplicationId());
        dealClient.applyOffer(loanOfferDTO);
        log.info("Applied offer with id {} saved in database", loanOfferDTO.getApplicationId());
    }
}

package ru.neoflex.application.services;

import ru.neoflex.openapi.dtos.LoanApplicationRequest;
import ru.neoflex.openapi.dtos.LoanOffer;

import java.util.List;

public interface ApplicationService {
    List<LoanOffer> createApplication(LoanApplicationRequest loanApplicationRequestDTO);

    void applyOffer(LoanOffer loanOfferDTO);
}

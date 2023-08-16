package ru.neoflex.application.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.application.services.ApplicationService;
import ru.neoflex.openapi.controllers.ApplicationApi;
import ru.neoflex.openapi.dtos.LoanApplicationRequestDTO;
import ru.neoflex.openapi.dtos.LoanOfferDTO;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApplicationController implements ApplicationApi {
    private final ApplicationService applicationService;

    @Override
    public ResponseEntity<List<LoanOfferDTO>> createApplication(LoanApplicationRequestDTO loanApplicationRequestDTO) {
        return new ResponseEntity<>(applicationService.createApplication(loanApplicationRequestDTO), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> applyOffer(LoanOfferDTO loanOfferDTO) {
        applicationService.applyOffer(loanOfferDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

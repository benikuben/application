package ru.neoflex.application.services;

import ru.neoflex.openapi.dtos.LoanApplicationRequestDTO;
import ru.neoflex.openapi.dtos.LoanOfferDTO;

import java.util.List;

public interface ApplicationService {
    List<LoanOfferDTO> createApplication(LoanApplicationRequestDTO loanApplicationRequestDTO);

    void applyOffer(LoanOfferDTO loanOfferDTO);
}

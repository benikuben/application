package ru.neoflex.application.feignclient;

import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.neoflex.openapi.dtos.LoanApplicationRequestDTO;
import ru.neoflex.openapi.dtos.LoanOfferDTO;

import java.util.List;

@FeignClient(name = "deal", url = "http://localhost:8082", path = "/deal")
public interface DealClient {
    @PostMapping("/application")
    ResponseEntity<List<LoanOfferDTO>> createApplication(@Valid @RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO);

    @PutMapping("/offer")
    ResponseEntity<Void> applyOffer(@Valid @RequestBody LoanOfferDTO loanOfferDTO);
}

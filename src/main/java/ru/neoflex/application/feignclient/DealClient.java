package ru.neoflex.application.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.neoflex.openapi.dtos.LoanApplicationRequest;
import ru.neoflex.openapi.dtos.LoanOffer;

import java.util.List;

@FeignClient(name = "deal", url = "${deal.url}", path = "/deal")
public interface DealClient {
    @PostMapping("/application")
    ResponseEntity<List<LoanOffer>> createApplication(@RequestBody LoanApplicationRequest loanApplicationRequestDTO);

    @PutMapping("/offer")
    ResponseEntity<Void> applyOffer(@RequestBody LoanOffer loanOfferDTO);
}

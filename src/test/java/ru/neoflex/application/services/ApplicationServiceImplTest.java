package ru.neoflex.application.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.neoflex.application.feignclient.DealClient;
import ru.neoflex.openapi.dtos.LoanApplicationRequestDTO;
import ru.neoflex.openapi.dtos.LoanOfferDTO;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ApplicationServiceImplTest {
    @Mock
    private DealClient dealClient;

    @InjectMocks
    private ApplicationServiceImpl applicationService;

    @Test
    void createApplication() {
        //expected
        List<LoanOfferDTO> offers = List.of(
//                new LoanOfferDTO(null, BigDecimal.valueOf(10000), BigDecimal.valueOf(10000), 6, BigDecimal.valueOf(1750.27), BigDecimal.valueOf(17), false, false),
//                new LoanOfferDTO(null, BigDecimal.valueOf(10000), BigDecimal.valueOf(10000), 6, BigDecimal.valueOf(1745.30), BigDecimal.valueOf(16), false, true),
//                new LoanOfferDTO(null, BigDecimal.valueOf(10000), BigDecimal.valueOf(10150), 6, BigDecimal.valueOf(1761.41), BigDecimal.valueOf(14), true, false),
                new LoanOfferDTO(1L, BigDecimal.valueOf(10000), BigDecimal.valueOf(10150), 6, BigDecimal.valueOf(1756.38), BigDecimal.valueOf(13), true, true)
        );

        when(dealClient.createApplication(any())).thenReturn(new ResponseEntity<>(offers, HttpStatus.OK));

        //actual
        List<LoanOfferDTO> actualOffers = applicationService.createApplication(new LoanApplicationRequestDTO());

        //tests
        assertNotNull(actualOffers);
        assertEquals(actualOffers, offers);
        verify(dealClient, times(1)).createApplication(any());
    }

    @Test
    void applyOffer() {
        when(dealClient.applyOffer(any())).thenReturn(new ResponseEntity<>(HttpStatus.OK));
        applicationService.applyOffer(new LoanOfferDTO());

        //tests
        verify(dealClient, times(1)).applyOffer(any());
    }
}
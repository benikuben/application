package ru.neoflex.application.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.neoflex.application.feignclient.DealClient;
import ru.neoflex.openapi.dtos.LoanApplicationRequest;
import ru.neoflex.openapi.dtos.LoanOffer;

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
        List<LoanOffer> offers = List.of(
                new LoanOffer(1L, BigDecimal.valueOf(10000), BigDecimal.valueOf(10150), 6, BigDecimal.valueOf(1756.38), BigDecimal.valueOf(13), true, true)
        );

        when(dealClient.createApplication(any())).thenReturn(new ResponseEntity<>(offers, HttpStatus.OK));

        //actual
        List<LoanOffer> actualOffers = applicationService.createApplication(new LoanApplicationRequest());

        //tests
        assertNotNull(actualOffers);
        assertEquals(actualOffers, offers);
        verify(dealClient, times(1)).createApplication(any());
    }

    @Test
    void applyOffer() {
        when(dealClient.applyOffer(any())).thenReturn(new ResponseEntity<>(HttpStatus.OK));
        applicationService.applyOffer(new LoanOffer());

        //tests
        verify(dealClient, times(1)).applyOffer(any());
    }
}
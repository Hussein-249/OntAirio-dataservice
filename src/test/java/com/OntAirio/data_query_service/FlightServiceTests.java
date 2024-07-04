package com.OntAirio.data_query_service;

import com.OntAirio.data_query_service.repository.FlightRepository;
import com.OntAirio.data_query_service.service.FlightService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class FlightServiceTests {

    @Mock
    private FlightRepository flightRepository;

    @InjectMocks
    private FlightService flightService;

    @Test
    public void testGetFlightsByOriginAndDestination() {
        // Write your test logic here
    }
}

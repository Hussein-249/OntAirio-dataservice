package com.OntAirio.data_query_service.service;

import com.OntAirio.data_query_service.entity.Flight;
import com.OntAirio.data_query_service.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightrepository;

    @Autowired
    public FlightService(FlightRepository flightrepository) {
        this.flightrepository = flightrepository;
    }

    public List<Flight> getFlightsByOriginAndDestination(String originICAO, String destinationICAO) {
        return flightrepository.findByOriginICAOAndDestinationICAO(originICAO, destinationICAO);
    }

}

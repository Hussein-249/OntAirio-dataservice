package com.OntAirio.data_query_service.controller;

import com.OntAirio.data_query_service.entity.Flight;
import com.OntAirio.data_query_service.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    @GetMapping("/flights")
    public List<Flight> getFlightsByOriginAndDestination(@RequestParam String originICAO, @RequestParam String destinationICAO) {
        return flightService.getFlightsByOriginAndDestination(originICAO, destinationICAO);
    }

}

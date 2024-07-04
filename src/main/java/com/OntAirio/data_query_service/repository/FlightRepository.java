package com.OntAirio.data_query_service.repository;

import com.OntAirio.data_query_service.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{
    List<Flight> findByDestinationICAO(String DestinationICAO);

    List<Flight> findByOriginICAO(String OriginICAO);

    List<Flight> findByOriginICAOAndDestinationICAO(String originICAO, String destinationICAO);

}

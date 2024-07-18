package com.OntAirio.data_query_service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


import java.util.Date;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private Integer flightNumber;

    private Integer dayNumber;

    @Temporal(TemporalType.DATE)
    private Date tripDate;

    @Temporal(TemporalType.TIME)
    private Date tripTime;

}

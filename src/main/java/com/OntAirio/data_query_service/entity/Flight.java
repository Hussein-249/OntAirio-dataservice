package com.OntAirio.data_query_service.entity;

import jakarta.persistence.*;

// Keep the @Column annotations. Postgres does not like to work with camelCase, but the current configuration works.

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    @Column(name = "number")
    private Integer number;

    @Column(name = "originICAO")
    private String originICAO;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destinationICAO")
    private String destinationICAO;

    @Column(name = "destination")
    private String destination;

    @Column(name = "duration")
    private Integer duration;

    public Flight() {
    }

    /* Getters */

    public Integer getUid() { return this.uid; }

    public Integer getNumber() { return this.number; }

    public String getOrigin() { return this.origin; }

    public String getOriginICAO() {
        return this.originICAO;
    }

    public String getDestination() { return this.destination; }

    public String getDestinationICAO() {
        return this.destinationICAO;
    }

    public Integer getDuration() {
        return this.duration;
    }

    /* Setters */

    public void setNumber(Integer num) {
        this.number = num;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setOriginICAO(String originICAO) {
        this.originICAO = originICAO;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDestinationICAO(String destinationICAO) {
        this.destinationICAO = destinationICAO;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}

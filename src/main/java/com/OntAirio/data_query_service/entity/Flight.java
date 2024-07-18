package com.OntAirio.data_query_service.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private Integer number;

    private String originICAO;

    private String origin;

    private String destinationICAO;

    private String destination;

    private Integer duration;

    private Integer durationMin;

    public Integer getUid() {
        return this.uid;
    }
    public Integer getNumber() {
        return this.number;
    }

    public String getOriginICAO() {
        return this.originICAO;
    }

    public String getDestinationICAO() {
        return this.destinationICAO;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setNumber(Integer num) {
        this.number = num;
    }

    public void setOriginICAO(String originICAO) {
        this.originICAO = originICAO;
    }

    public void setDestinationICAO(String destinationICAO) {
        this.destinationICAO = destinationICAO;
    }
}

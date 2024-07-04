package com.OntAirio.data_query_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private Short number;

    private String originICAO;

    private String destinationICAO;

    private Integer durationMin;

    public Integer getUid() {
        return this.uid;
    }
    public Short getNumber() {
        return this.number;
    }

    public String getOriginICAO() {
        return this.originICAO;
    }

    public String getDestinationICAO() {
        return this.destinationICAO;
    }

    public Integer getDuration() {
        return this.durationMin;
    }

}

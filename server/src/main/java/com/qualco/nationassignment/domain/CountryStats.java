package com.qualco.nationassignment.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CountryStats {

    @EmbeddedId
    private CountryStatsKey countryStatsKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", updatable = false, insertable = false)
    @MapsId("countryId")
    @JsonBackReference
    private Country country;

    private Integer population;

    private Double gdp;

    public Integer getYear(){
        return countryStatsKey.getYear();
    }

}

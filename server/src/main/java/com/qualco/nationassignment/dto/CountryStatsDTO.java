package com.qualco.nationassignment.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryStatsDTO {

    private String countryName;

    private String countryCode3;

    private Integer population;

    private Double gdp;

    private String year;
}

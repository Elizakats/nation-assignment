package com.qualco.nationassignment.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class CountryLanguageKey implements Serializable {

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "language_id")
    private Integer languageId;
}

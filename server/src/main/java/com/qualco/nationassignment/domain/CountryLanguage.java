package com.qualco.nationassignment.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "country_languages")
@Getter
@Setter
public class CountryLanguage {

    @EmbeddedId
    CountryLanguageKey countryLanguageKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("countryId")
    @JoinColumn(name = "country_id")
    @JsonBackReference
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("languageId")
    @JoinColumn(name = "language_id")
    @JsonBackReference
    private Language language;

    private Boolean official;

}

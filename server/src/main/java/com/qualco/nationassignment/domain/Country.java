package com.qualco.nationassignment.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Integer id;

    private String name;

    private Double area;

    private Date nationalDay;

    private String countryCode2;

    private String countryCode3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonBackReference
    private Region region;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<CountryStats> countryStats;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<CountryLanguage> countryLanguages;

}

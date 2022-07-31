package com.qualco.nationassignment.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="continents")
@Getter
@Setter
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="continent_id")
    private Integer id;

    private String name;

    @OneToMany(mappedBy="continent",fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Region> regions;
}

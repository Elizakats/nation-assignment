package com.qualco.nationassignment.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="region_areas")
@Getter
@Setter
public class RegionArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String regionName;

    private Double regionArea;
}

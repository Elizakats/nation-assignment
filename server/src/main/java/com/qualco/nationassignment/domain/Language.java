package com.qualco.nationassignment.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="languages")
@Getter
@Setter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="language_id")
    private Integer id;

    private String language;

    @OneToMany(mappedBy = "language",fetch = FetchType.LAZY)
    @JsonManagedReference
    Set<CountryLanguage> CountryLanguages;

}

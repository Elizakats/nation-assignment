package com.qualco.nationassignment.repository;

import com.qualco.nationassignment.domain.CountryLanguage;
import com.qualco.nationassignment.domain.CountryLanguageKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageKey> {

    List<CountryLanguage> findByCountryId(Integer countryId);
}

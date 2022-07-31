package com.qualco.nationassignment.repository;

import com.qualco.nationassignment.domain.CountryStats;
import com.qualco.nationassignment.domain.CountryStatsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, CountryStatsKey> {

    @Query(value = "Select * from country_stats where ROUND(gdp/population, 4) in" +
            "(Select ROUND(max(gdp/population),4) from  country_stats  group by country_id)",
            nativeQuery = true)
    List<CountryStats> getCountriesWithMaxGDPPerPopulationAlongYears();
}

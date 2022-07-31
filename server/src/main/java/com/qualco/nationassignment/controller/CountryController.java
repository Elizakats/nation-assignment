package com.qualco.nationassignment.controller;

import com.qualco.nationassignment.domain.CountryLanguage;
import com.qualco.nationassignment.domain.CountryStats;
import com.qualco.nationassignment.dto.CountryDTO;
import com.qualco.nationassignment.dto.CountryStatsDTO;
import com.qualco.nationassignment.dto.LanguageDTO;
import com.qualco.nationassignment.repository.CountryLanguageRepository;
import com.qualco.nationassignment.repository.CountryRepository;
import com.qualco.nationassignment.repository.CountryStatsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    private final CountryRepository countryRepository;

    private final CountryLanguageRepository countryLanguageRepository;

    private final CountryStatsRepository countryStatsRepository;

    private ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/countries")
    public List<CountryDTO> getAllCountries() {

        return countryRepository.findAll()
                .stream()
                .map(country ->
                        modelMapper.map(country, CountryDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/countries/{id}/languages")
    public List<LanguageDTO> getCountryLanguages(@PathVariable("id") Integer countryId) {

        List<CountryLanguage> countryLanguages = countryLanguageRepository.findByCountryId(countryId);

        return countryLanguages
                .stream()
                .map(countryLanguage -> modelMapper.map(countryLanguage.getLanguage(), LanguageDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/countries/stats")
    public List<CountryStatsDTO> getCountryStats() {
        List<CountryStats> countryStatsList = countryStatsRepository.getCountriesWithMaxGDPPerPopulationAlongYears();

        return countryStatsList
                .stream()
                .map(countryStats -> {
                    CountryStatsDTO countryStatsDTO = new CountryStatsDTO();
                    countryStatsDTO.setPopulation(countryStats.getPopulation());
                    countryStatsDTO.setGdp(countryStats.getGdp());
                    countryStatsDTO.setYear(String.valueOf(countryStats.getYear()));
                    countryStatsDTO.setCountryName(countryStats.getCountry().getName());
                    countryStatsDTO.setCountryCode3(countryStats.getCountry().getCountryCode3());

                    return countryStatsDTO;
                })
                .collect(Collectors.toList());

    }
}

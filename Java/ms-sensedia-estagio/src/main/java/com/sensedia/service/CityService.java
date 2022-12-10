package com.sensedia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sensedia.model.dto.GetCitiesByCountryDTO;
import com.sensedia.model.dto.request.CreateCitiesByCountryRequest;
import com.sensedia.model.dto.request.UpdateCitiesByCountryRequest;
import com.sensedia.model.dto.response.GetCitiesResponse;
import com.sensedia.repository.CityRepository;
import com.sensedia.repository.CountryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    private final CountryRepository countryRepository;

    public void createCitiesByCountry(String countryId, CreateCitiesByCountryRequest createCitiesByCountryRequest) {
        log.info("Creating city by country id{}...", countryId);
        try {
            // implementar aqui

            log.info("City created successfully...");
        } catch (Exception e) {
            log.error("Error when retrieving countries: {}", e.getMessage());
            throw e;
        }
    }

    public void updateCitiesByCountry(String countryId, String cityId, UpdateCitiesByCountryRequest updateCitiesByCountryRequest) {
        log.info("Updating city id {} by country id{}...", cityId, countryId);
        try {
            // implementar aqui

            log.info("City updated successfully...");
        } catch (Exception e) {
            log.error("Error when city id {} by country id{}...", cityId, countryId);
            throw e;
        }
    }

    public List<GetCitiesResponse> getCitiesByCountry(String countryId, GetCitiesByCountryDTO getCitiesByCountryDTO) {
        log.info("Retrieving cities by country id {} and filters {}...", countryId, getCitiesByCountryDTO);
        try {
            // implementar aqui

            return null;
        } catch (Exception e) {
            log.error("Error when retrieving cities by country id {} and filters {}...", countryId, getCitiesByCountryDTO);
            throw e;
        }
    }
}

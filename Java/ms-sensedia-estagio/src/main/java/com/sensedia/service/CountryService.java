package com.sensedia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sensedia.model.dto.response.GetCountriesResponse;
import com.sensedia.model.dto.response.GetCountryPassowordsResponse;
import com.sensedia.repository.CountryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryService {

    private final Integer QUANT_SENSEDIERS = 850;

    private final CountryRepository countryRepository;

    public List<GetCountriesResponse> getCountries() {
        log.info("Retrieving countries...");
        try {
            // implementar aqui

            return null;
        } catch (Exception e) {
            log.error("Error when retrieving countries: {}", e.getMessage());
            throw e;
        }
    }

    public GetCountryPassowordsResponse getCountryPasswords(String countryId) {
        log.info("Retrieving country {} passwords...", countryId);
        try {
            // implementar aqui

            return null;
        } catch (Exception e) {
            log.error("Error when retrieving country passwords: {}", e.getMessage());
            throw e;
        }
    }
}

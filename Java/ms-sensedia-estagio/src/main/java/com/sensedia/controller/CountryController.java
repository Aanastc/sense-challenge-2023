package com.sensedia.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sensedia.model.dto.response.GetCountriesResponse;
import com.sensedia.model.dto.response.GetCountryPassowordsResponse;
import com.sensedia.service.CountryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/countries")
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetCountriesResponse> getCountries() {
        return countryService.getCountries();
    }

    @GetMapping("/{countryId}/passwords")
    @ResponseStatus(HttpStatus.OK)
    public GetCountryPassowordsResponse getCountryPasswords(@PathVariable String countryId) {
        return countryService.getCountryPasswords(countryId);
    }
}

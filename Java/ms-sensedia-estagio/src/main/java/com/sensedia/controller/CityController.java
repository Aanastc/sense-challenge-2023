package com.sensedia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sensedia.enumeration.OrderType;
import com.sensedia.model.dto.GetCitiesByCountryDTO;
import com.sensedia.model.dto.request.CreateCitiesByCountryRequest;
import com.sensedia.model.dto.request.UpdateCitiesByCountryRequest;
import com.sensedia.model.dto.response.GetCitiesResponse;
import com.sensedia.service.CityService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/countries/{countryId}/cities")
public class CityController {

    private final CityService cityService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCitiesByCountry(@PathVariable String countryId,
            @RequestBody @Valid CreateCitiesByCountryRequest createCitiesByCountryRequest) {
        cityService.createCitiesByCountry(countryId, createCitiesByCountryRequest);
    }

    @PutMapping("/{cityId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCityByCountry(@PathVariable String countryId, @PathVariable String cityId,
            @RequestBody @Valid UpdateCitiesByCountryRequest updateCitiesByCountryRequest) {
        cityService.updateCitiesByCountry(countryId, cityId, updateCitiesByCountryRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetCitiesResponse> getCitiesByCountry(@PathVariable String countryId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Boolean capital,
            @RequestParam(required = false) Integer initialPopulation,
            @RequestParam(required = false) Integer finalPopulation,
            @RequestParam(required = false) OrderType order) {

        GetCitiesByCountryDTO getCitiesByCountryDTO = GetCitiesByCountryDTO.builder()
                .name(name)
                .capital(capital)
                .initialPopulation(initialPopulation)
                .finalPopulation(finalPopulation)
                .order(order)
                .build();

        return cityService.getCitiesByCountry(countryId, getCitiesByCountryDTO);
    }

}

package com.sensedia.model.dto.response;

import com.sensedia.model.domain.CountryDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCountriesResponse {

    private String id;

    private String name;

    private Long pib;

    private Boolean sensedia;

    public static GetCountriesResponse valueOf(CountryDomain countryDomain) {
        return GetCountriesResponse.builder()
                .id(countryDomain.getId())
                .name(countryDomain.getName())
                .pib(countryDomain.getPib())
                .sensedia(countryDomain.getSensedia())
                .build();
    }

}

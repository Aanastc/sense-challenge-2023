package com.sensedia.model.dto.response;

import com.sensedia.model.domain.CityDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCitiesResponse {

    private String id;

    private String name;

    private Integer population;

    private Boolean capital;

    public static GetCitiesResponse valueOf(CityDomain cityDomain) {
        return GetCitiesResponse.builder()
                .id(cityDomain.getId())
                .name(cityDomain.getName())
                .population(cityDomain.getPopulation())
                .capital(cityDomain.getCapital())
                .build();
    }

}

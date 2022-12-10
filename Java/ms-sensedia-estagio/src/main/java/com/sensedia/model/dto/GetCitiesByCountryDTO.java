package com.sensedia.model.dto;

import com.sensedia.enumeration.OrderType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCitiesByCountryDTO {

    private String name;

    private Boolean capital;

    private Integer initialPopulation;

    private Integer finalPopulation;

    private OrderType order;

}

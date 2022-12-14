package com.sensedia.model.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class CreateCitiesByCountryRequest {

    @NotBlank(message = "400.002")
    private String name;

    @NotNull(message = "400.002")
    private Integer population;

    @NotNull(message = "400.002")
    private Boolean capital;

}

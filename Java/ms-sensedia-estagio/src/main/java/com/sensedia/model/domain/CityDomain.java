package com.sensedia.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.sensedia.model.dto.request.CreateCitiesByCountryRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
public class CityDomain {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private Integer population;

    @Column(name = "capital")
    private Boolean capital;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private CountryDomain country;

    public static CityDomain valueOf(CreateCitiesByCountryRequest city) {
        return CityDomain.builder()
                .name(city.getName())
                .population(city.getPopulation())
                .capital(city.getCapital())
                .build();
    }

}

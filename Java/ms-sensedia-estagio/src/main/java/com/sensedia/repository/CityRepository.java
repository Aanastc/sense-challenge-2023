package com.sensedia.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sensedia.model.domain.CityDomain;
import com.sensedia.model.dto.GetCitiesByCountryDTO;

@Repository
public interface CityRepository extends JpaRepository<CityDomain, String> {

    CityDomain findByCountryId(String countryId);

    CityDomain findByCountryIdAndName(String countryId, String name);

    CityDomain save(CityDomain cityDomain);

    @Query("SELECT cityDomain FROM CityDomain cityDomain WHERE " +
            "(:#{#dto.name} IS NULL OR cityDomain.name = :#{#dto.name}) AND" +
            "(:#{#dto.capital} IS NULL OR cityDomain.capital = :#{#dto.capital}) AND" +
            "(:#{#dto.initialPopulation} IS NULL OR cityDomain.population >= :#{#dto.initialPopulation}) AND " +
            "(:#{#dto.finalPopulation} IS NULL OR cityDomain.population <= :#{#dto.finalPopulation})")
    List<CityDomain> findCitiesByFilters(GetCitiesByCountryDTO dto, Sort sort);
}

package com.sensedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sensedia.model.domain.CountryDomain;

@Repository
public interface CountryRepository extends JpaRepository<CountryDomain, String> {
}

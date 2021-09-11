package com.clientregistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientregistration.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}

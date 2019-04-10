package com.saurav.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurav.webapp.model.City;

public interface CityDao extends JpaRepository<City, Long> {

}

package com.saurav.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saurav.webapp.dao.CityDao;
import com.saurav.webapp.model.City;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "City names auto suggestion APIs")
public class WebAppController {
	
	@Autowired
	private CityDao cityDao;
	
	@ApiOperation(value = "Return Welcome message", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved message"),
			@ApiResponse(code = 401, message = "You are not authorized to view this resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		String msg = "Welcome,You are awesome!";
		return msg;
	}
	
	@ApiOperation(value = "Returns auto suggestions for city names", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved suggestions"),
			@ApiResponse(code = 401, message = "You are not authorized to view this resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping("/suggest_cities")
	public List<City> getAllCities() {
		
		return cityDao.findAll();
	}

}

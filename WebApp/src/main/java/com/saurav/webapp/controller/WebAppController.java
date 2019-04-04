package com.saurav.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "City names auto suggestion APIs")
public class WebAppController {
	
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

}

package com.app.actuatorservice;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.util.JSONParser;

//Implementation of the controller 

@Controller
public class ApiController {
	

	@GetMapping("/api/v1/LON")
	@ResponseBody
	public Map<String, Object> printAirport() {


		Map<String, Object> airportMap = JSONParser.read("src/main/resources/requests/airport.json");
		
	    return airportMap;
	  }
	
	@GetMapping("/api/v1/countries_name")
	@ResponseBody
	public Map<String, Object> printCountries() {
		
		Map<String, Object> countriesMap = JSONParser.read("src/main/resources/requests/country.json");
		
	    return countriesMap;
	  }
	
	@GetMapping("/api/v1/states")
	@ResponseBody
	public Map<String, Object> printStates() {
		
		Map<String, Object> statesMap = JSONParser.read("src/main/resources/requests/state.json");
		
	    return statesMap;
	  }
	
}

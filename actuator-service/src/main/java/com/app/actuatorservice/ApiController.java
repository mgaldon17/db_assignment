package com.app.actuatorservice;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.util.JSONParser;

@Controller
public class ApiController {
	

	@GetMapping("/api/v1/FRA")
	@ResponseBody
	public Map<String, Object> printAirport(@RequestParam(name="name", required=false) String name) {
		
		Map<String, Object> airportMap = JSONParser.read("src/main/resources/requests/airport.json");
		
	    return airportMap;
	  }
	
	@GetMapping("/api/v1/countries_name")
	@ResponseBody
	public Map<String, Object> printCountries(@RequestParam(name="name", required=false) String name) {
		
		Map<String, Object> countriesMap = JSONParser.read("src/main/resources/requests/country.json");
		
	    return countriesMap;
	  }
	
	@GetMapping("/api/v1/states")
	@ResponseBody
	public Map<String, Object> printStates(@RequestParam(name="name", required=false) String name) {
		
		Map<String, Object> statesMap = JSONParser.read("src/main/resources/requests/state.json");
		
	    return statesMap;
	  }
	
}

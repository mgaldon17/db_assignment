package com.app.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.app.actuatorservice.ApiController;

public class JUnitControllerTests {
	
	@Test
	public void testAirport() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printAirport();
		assertTrue(map.size()==4);
	}
	
	@Test
	public void testCountry() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printStates();
		assertTrue(map.size()==4);
	}
	
	@Test
	public void testState() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printCountries();
		assertTrue(map.size()==3);
	}
	
	@Test
	public void testAirportPath() {
		
		File f = new File("src/main/resources/requests/airport.json");
		assertTrue(f.exists());
	}
	
	@Test
	public void testCountryPath() {
		
		File f = new File("src/main/resources/requests/country.json");
		assertTrue(f.exists());
	}
	
	@Test
	public void testStatePath() {
		
		File f = new File("src/main/resources/requests/state.json");
		assertTrue(f.exists());
	}
	
}

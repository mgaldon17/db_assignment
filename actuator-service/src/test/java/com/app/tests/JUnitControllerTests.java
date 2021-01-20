package com.app.tests;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import com.app.actuatorservice.ApiController;
import com.github.cliftonlabs.json_simple.JsonObject;

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

}

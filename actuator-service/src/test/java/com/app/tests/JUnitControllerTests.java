package com.app.tests;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.app.actuatorservice.ApiController;

public class JUnitControllerTests {
	
	//Test size of JSON
	@Test
	public void testAirport() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printAirport();
		assertTrue(map.size()==4);
	}
	
	@Test
	public void testCountrySize() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printStates();
		assertTrue(map.size()==4);
	}
	
	@Test
	public void testStateSize() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printCountries();
		assertTrue(map.size()==3);
	}
	
	//Test size of JSON Key-Value
	@Test
	public void testAirportValue() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printAirport();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(0)).equals("LON"));
		
	}
	
	@Test
	public void testAirportStatusCode() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printAirport();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(3)).toString().equals("200"));
		
	}
	
	@Test
	public void testAirportStatus() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printAirport();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(2)).toString().equals("true"));
		
	}
	
	@Test
	public void testCountry() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printCountries();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);

		assertTrue(k.get(0).equals("countries"));

	}
	
	@Test
	public void testCountryStatusCode() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printCountries();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);

		assertTrue(map.get(k.get(2)).toString().equals("200"));
		
	}
	
	@Test
	public void testCountryStatus() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printCountries();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(1)).toString().equals("true"));
		
	}
	
	@Test
	public void testState() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printStates();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(0)).equals("State"));

	}
	
	@Test
	public void testStateStatus() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printStates();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(1)).toString().equals("true"));

	}
	
	@Test
	public void testStateStatusCode() {
		ApiController apiController= new ApiController();
		Map<String, Object> map = apiController.printStates();
		Set keys =map.keySet();
		List<Object> k = new ArrayList<Object>(keys);
		assertTrue(map.get(k.get(2)).toString().equals("200"));

	}
	
	//Path to JSON Files
	
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

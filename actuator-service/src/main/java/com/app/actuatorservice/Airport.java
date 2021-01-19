package com.app.actuatorservice;

public class Airport {
	public String name;
	public double latitude;
	public double longitude; 
	public String location; 
	public int elevation; 
	public String website; 
	public String State; 
	public String Country;
	
	public Airport(String name, double latitude, double longitude, String location, int elevation, String website,
			String state, String country) {

		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.location = location;
		this.elevation = elevation;
		this.website = website;
		this.State = state;
		this.Country = country;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getElevation() {
		return elevation;
	}


	public void setElevation(int elevation) {
		this.elevation = elevation;
	}


	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	

}

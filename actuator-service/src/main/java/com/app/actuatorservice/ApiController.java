package com.app.actuatorservice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
	
	
	@GetMapping("/api/v1/FRA")
	@ResponseBody
	public Airport sayHello(@RequestParam(name="name", required=false) String name) {
	    return new Airport("FRA", 50.050735, 8.570773, "Frankfurt", 364, "www.Frankfurt-airport.com", "Hessen", "Germany");
	  }
}

package com.app.actuatorservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorServiceApp{

  public static void main(String[] args) {
	  	SpringApplication springApp = new SpringApplication(ActuatorServiceApp.class);
	  	/*The port has been changed to prevent possible conflicts when running the app due to possible 
	  	processes that also listen to the port 8080*/
	  	springApp.setDefaultProperties(Collections.singletonMap("server.port", "8888")); 
	  	springApp.run();
  }

}

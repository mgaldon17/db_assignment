package com.app.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.github.cliftonlabs.json_simple.JsonObject;

public class cURL {
	
	public static void request() throws IOException {
		String command =
				  "curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'APC-Auth: 7c92e20dad' 'air-port-codes.com/api/v1/single?iata=LON'";

		Process process = Runtime.getRuntime().exec(command);
		InputStream inputStream = process.getInputStream();

	    BufferedReader in = new BufferedReader(
	            new InputStreamReader(inputStream));
	    
		String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

	    //print result
	    System.out.println("Hola");
	    System.out.println(response.toString());
		
		
	}
	
	public static void main(String[] args) throws IOException {
		request();

	}
}

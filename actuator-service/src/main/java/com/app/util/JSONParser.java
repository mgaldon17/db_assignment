package com.app.util;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;


public class JSONParser {
	
	public static Map<String, Object> read(String path)  {
		try {
		    // create a reader
			try {
				Path p = Paths.get(path);
				Reader reader = Files.newBufferedReader(p);
				// create parser
			    JsonObject parser = (JsonObject) Jsoner.deserialize(reader);
			    Map<String, Object> map = new HashMap<String, Object>();
			    
			    for (Object key : parser.keySet()) {
			    	
		    		String keyStr = (String) key;
		    		Object keyvalue = parser.get(keyStr);

			    	map.put(keyStr, keyvalue);
			    }
			    
			    reader.close();
			    return map;
			    
			} catch (NoSuchFileException e) {
				System.out.println("\nJSON file not found. Try another linkc.");
				
			}
	
		} catch (JsonException | IOException ex) {
		    ex.printStackTrace();
		    System.exit(-1);
		}
		
		return null;
	}    

}

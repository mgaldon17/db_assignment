package com.app.util;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;


public class JSONParser {
	
	static String json = "...";
	
	public static Map<String, Object> read(String path) {
		try {
		    // create a reader
		    Reader reader = Files.newBufferedReader(Paths.get(path));

		    // create parser
		    JsonObject parser = (JsonObject) Jsoner.deserialize(reader);
		    Map<String, Object> map = new HashMap<String, Object>();
		    
		    for (Object key : parser.keySet()) {
		    	
	    		String keyStr = (String) key;
	    		Object keyvalue = parser.get(keyStr);
		        System.out.println(keyStr + " : " + keyvalue);
		    	map.put(keyStr, keyvalue);
		        
		    }
		    
		    reader.close();
		    return map;
		    
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		
		return null;
	}    

}

# coding_assignment
Spring Boot 2.x application exposing REST requests without requiring the security headers

This is a Spring Boot application that allows the user to make 3 curl request to localhost
and obtain the same result as if the request were made directly using the proper link. 

The original request provided in the assignment instructions are:

1) curl -kX POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'APC-Auth: 7c92e20dad' --header 'APC-Auth-Secret: 339484325aa8120' 'https://www.air-port-codes.com/api/v1/single?iata=LON'
2) curl -kX POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'APC-Auth: 7c92e20dad' --header 'APC-Auth-Secret: 339484325aa8120' 'https://www.air-port-codes.com/api/v1/countries?field_name=name'
3) curl -kX POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'APC-Auth: 7c92e20dad' --header 'APC-Auth-Secret: 339484325aa8120' 'https://www.air-port-codes.com/api/v1/states?country=IN'

Those make the request directly to the host air-port-codes.com/

The developed Spring app starts up Apache server in localhost and allows us to tun the request
locally. The links to the requests are according to the instructions, respectively:

1) curl localhost:8080/api/v1/LON
2) curl localhost:8080/api/v1/countries_name
3) curl localhost:8080/api/v1/states

The payload of each request to the website is saved locally in three .json files and included in the directory: 
actuator-service\src\main\resources\requests 

The app takes the json fies and parses them to handle to the data to the server in order for it 
to print the payload upon curl request to localhost. This way does not require any security concern. 

An alternative solution would require the execution of a curl request inside Java to the host air-port-codes.com/
but would need the API key. Consequently it would handle the data to the localhost apache server. This path regards security and 
would stream the data directly from the air-port-codes server. The execution of the local curl would not require the API key. 
This solution still makes use of the API key, but it would be decoupled from the curl command line by not requiring the security headers. 

How to run the application

The application has been exported as a standalone runnable jar. The instrutions to run the app are written assuming that Java JDK is intalled and set up 
and that we are in Windows. To start it, please follow the steps:

1) In the commend line, go to /actuator-service
2) Run mvn clean install 
3) In the command line, go to /actuator-service
4) Run the command java -jar DeutscheBank.jar
5) Open a new terminal when the server starts up successfully
6) Run the following commands to make the request:
	
	1) curl localhost:8080/api/v1/LON
	2) curl localhost:8080/api/v1/countries_name
	3) curl localhost:8080/api/v1/states

	In case the entered link is not found, the app wont crash and will keep running. 
	
5) To close the app, simply make Ctrl+Z in the spring window to shut down the server. 

Also, it is possible to run the application in Eclipse or another API. 
To do so:

1) Import the project as a Maven project
2) Run maven install 
3) Run ActuatorServiceApp.java as a Java application
4) Execute the curl command in a command line as before

If the app runs successfully, maven install will run until the end, pass the 15 tests and install dependencies. The server will start after executing 
java -jar DeutscheBank.jar or running ActuatorServiceApp.java and will remain up. Lastly, the curl requests will provide the expected response.  
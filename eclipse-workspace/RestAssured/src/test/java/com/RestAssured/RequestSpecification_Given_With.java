package com.RestAssured;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecification_Given_With {
	
	RequestSpecification rs;
	
	@BeforeSuite
	public void setRequestSpecification() {
		
		rs =	RestAssured.with() 		//we can given or with here
		.baseUri("https://reqres.in/")
		.basePath("/api/users");
		RestAssured.requestSpecification = rs;
	}
	
	  @Test(enabled = true)
	    public void getAnEmployee() {
	        
	        RestAssured
	            .given()
	            .when().get("/2")
	            .prettyPrint();
	    }
	  
	    @Test(enabled = true)
	    public void createAnEmployee() {
	    	
	    	RestAssured
	    	.given()
	    	.header("Content-Type","Application/json")
	    	.body("{\r\n"
	    			+ "    \"name\": \"Siva\",\r\n"
	    			+ "    \"job\": \"Thara\"\r\n"
	    			+ "}")
	    	.when().post("/api/users")
	    	.prettyPrint();
	    	
	    }
}

package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecification_Builder {
	
	public static void main(String[] args) {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		
		builder.setBaseUri("https://reqres.in/");
		
		builder.setBasePath("/api/users");
		
		RequestSpecification spec = builder.build();
		
		RestAssured.given().spec(spec).get().prettyPrint();
		
	}

}

package com.Auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerToken_Auth {

@Test
public void apiKeyAuth() {
		
		String token= "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";
		
		RestAssured
		.given()
		.header("Authorization","Bearer"+token)
		.when()
		.get("https://api.github.com/user/repos")
		.prettyPrint();
	}
	
}

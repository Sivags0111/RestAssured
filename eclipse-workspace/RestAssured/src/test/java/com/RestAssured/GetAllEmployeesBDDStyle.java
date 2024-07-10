package com.RestAssured;

import java.io.File;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetAllEmployeesBDDStyle {

	@Test(enabled = false)
	public void getAllEmployees() {

		RestAssured
		.given().baseUri("https://reqres.in/")
		.when().get("/api/users?page=2")
		.prettyPrint();
	}

	@Test(enabled = false)
	public void getAnEmployee() {

		RestAssured
		.given().baseUri("https://reqres.in/")
		.when().get("/api/users/2")
		.prettyPrint();
	}
	@Test(enabled = false)
	public void createAnEmployee() {

		RestAssured
		.given().baseUri("https://reqres.in/")
		.header("Content-Type","Application/json")
		.body("{\r\n"
				+ "    \"name\": \"Siva\",\r\n"
				+ "    \"job\": \"Thara\"\r\n"
				+ "}")
		.when().post("/api/users")
		.prettyPrint();

	}
	@Test	(enabled = false)
	public void updateAnEmployee() {

		RestAssured
		.given().baseUri("https://reqres.in/")
		.header("Content-Type","Application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		.when().put("/api/users/2")
		.prettyPrint();
	}
	@Test(enabled = false)
	public void deleteAnEmployee() {
		RestAssured
		.given().baseUri("https://reqres.in/")
		.when().delete("/api/users/2")
		.prettyPrint();
	}

	@Test(enabled = true)
	public void createEmployeeFromJssonFile() {

		File jsonFile = new File("postData.json");
		RestAssured
		.given().baseUri("https://reqres.in/")
		.header("Content-Type","application/json")
		.body(jsonFile)
		.when().post("/api/users")
		.prettyPrint();

	}

}

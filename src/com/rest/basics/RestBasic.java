package com.rest.basics;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matcher.*;
import org.hamcrest.Matcher.*;

public class RestBasic {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		//		GET Call API
//		Response res= given().log().all()
//				.queryParam("page", "2")
//				.header("Content-Type","application/json")
//				.when().get("https://reqres.in/api/users?page=2")
//				.then().log().all().statusCode(200).extract().response();

		//		POST Call
		Response res1= given().log().all()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"ABC\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}")
				.when().post("https://reqres.in/api/users")
				.then().log().all().statusCode(200).extract().response();

		//		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		//		System.out.println(res.asString());
		//		JsonPath js=new JsonPath(res.asString());
		//		String place=js.get("place_id");
		//		System.out.println(place);
		//		
		//		//put API
		//		
		//		Response resput=(Response)given().log().all()
		//		.queryParam("key", "qaclick12")
		//		.header("Content-Type","application/json")
		//		.body("{\r\n" + 
		//				"\"place_id\":\""+place+"\",\r\n" + 
		//				"\"address\":\"29, side layout, cohen 09\",\r\n" + 
		//				"\"key\":\"qaclick123\"\r\n" + 
		//				"}")
		//		.when().put("map/api/place/update/json")
		//		.then().assertThat().log().all().statusCode(200).extract().response();
	}



}

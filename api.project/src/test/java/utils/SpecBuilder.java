package utils;

import java.io.IOException;

import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {
	
	@Step
	public static RequestSpecification reqSpec() throws IOException 
	{
		return new RequestSpecBuilder()
		
		.addHeader("Content-Type", "application/json")
		
		.setBaseUri("https://petstore.swagger.io")
		
		.setBasePath("/v2")
		
		.log(LogDetail.ALL)
		
		.build();
		
	}
	
	@Step
	public static ResponseSpecification resSpec()
	{
	return	new ResponseSpecBuilder()
		
		.expectContentType(ContentType.JSON)
		
		.log(LogDetail.ALL)
		
		.build();
	}

}

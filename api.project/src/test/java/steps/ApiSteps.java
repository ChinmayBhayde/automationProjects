package steps;

import java.io.File;
import java.io.IOException;

import POJO.ApiPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.SpecBuilder;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class ApiSteps {
	
	RequestSpecification res;
	Response response;
	
	@Given("create POST api payload")
	public void create_post_api_payload() throws IOException {
	    
		ApiPojo req = new ApiPojo();
		req.setId(12345);
		req.setUsername("username123");
		req.setFirstName("FirstName1");
		req.setLastName("LastName");
		req.setEmail("Test@gmail.com");
		req.setPassword("Password");
		req.setPhone("987654321");
		req.setUserStatus(1);
		
		res = given(SpecBuilder.reqSpec())
						.body(req);
		
	}

	@When("user calls with POST http request")
	public void user_calls_with_post_http_request() {

			res.when()
				.post("/user/createWithArray");
		
	}

	@Then("API call executed with status code {int}")
	public void api_call_executed_with_status_code(Integer int1) {
	    
		response.as(ApiPojo.class);
				
		response.then()
				.assertThat()
				.statusCode(int1);
		
	}

	@Given("Get a playlist payload")
	public void get_a_playlist_payload() throws IOException {
		
		res = given(SpecBuilder.reqSpec())
				.pathParam("username", "username123");			  
	}


	@When("user calls with GET http request")
	public void user_calls_with_get_http_request() {
	    
		response 	= res.when()
				
				.get("user/{username}");
	}

	@Then("API call executes with status code {int}")
	public void api_call_executes_with_status_code(Integer int1) {
	    
			response.then()
		
			.spec(SpecBuilder.resSpec());
	
			assertEquals(response.statusCode(), int1);
		
	}

	@Then("response is verified with the expected response")
	public void response_is_verified_with_the_expected_response() {
	    
			this.response.then().assertThat()
			.body(JsonSchemaValidator.
					matchesJsonSchema(new File(System.getProperty("user.dir")+"/api.project/src/test/resources/response.json")));
	}

}
package Rest_API_GitHub;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetAllRequests {
	
	@Test
	public void getUsers()  //get all users from page 2
	{
	
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		
		.then()
		   .statusCode(200)
		   .body("page",equalTo(2))
		   .log().all();
		
	}
}

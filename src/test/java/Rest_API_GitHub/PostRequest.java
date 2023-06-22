package Rest_API_GitHub;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class PostRequest {
	
	
	@Test
	public void createUser()
	{
		String data="{\"name\":\"amit\",\"job\":\"leader\"}";
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201) 
		.body("name", equalTo("amit")) //validate name and job created based on the req payload
		.body("job", equalTo("leader"))
		.log().all();
	}

}

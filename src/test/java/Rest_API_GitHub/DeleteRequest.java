package Rest_API_GitHub;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class DeleteRequest {
	
	@Test
	public void deleteUser()
	{
	
		 given()
		
		.when()
		.delete("https://reqres.in/api/users/"+97)
		
		.then()
		.statusCode(204)
		.log().all();
	
	}

}

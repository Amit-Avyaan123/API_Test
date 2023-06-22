package Rest_API_GitHub;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class PutRequestByHashmap {
	
	@Test
	public void updateUser()
	{
	
		  HashMap data=new HashMap();
	      data.put("name", "amit");
	      data.put("job", "teacher");
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.put("https://reqres.in/api/users/"+97)
		
		.then()
		.statusCode(200)
		.body("name", equalTo("amit")) //validate name and job created based on the req payload
		.body("job", equalTo("teacher"))
		.log().all();
	
	}

}

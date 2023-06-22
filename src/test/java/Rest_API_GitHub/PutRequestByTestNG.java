package Rest_API_GitHub;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class PutRequestByTestNG {
	
	@Test
	public void updateUser()
	{
	
		  HashMap data=new HashMap();
	      data.put("name", "amit");
	      data.put("job", "teacher");
		
		Response res=(Response) given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.put("https://reqres.in/api/users/"+97);
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.header("Connection"), "keep-alive");
		Assert.assertEquals(res.header("Server"), "cloudflare");
		//Assert.assertEquals(res.getBody(), "teacher");
		
//		.then()
//		.statusCode(200)
//		.body("name", equalTo("amit")) //validate name and job created based on the req payload
//		.body("job", equalTo("teacher"))
		//.log().all();
	
	}

}

package Rest_API_GitHub;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;   //Required


public class PostRequestByHashmap {
	
	@Test
	public void PostRequestByHashmap()
	{
		
         HashMap data=new HashMap();
         data.put("name", "amit");
         data.put("job", "leader");
         
         // if you have multiple value for courses then declare like below
//         String courseArr[]= {"C","C++"};
//         data.put("courses","courseArr");
		
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

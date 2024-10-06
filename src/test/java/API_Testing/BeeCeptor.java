package API_Testing;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BeeCeptor {

	@Test
	public void GetListBlogPosts() {
		//get - requesting a web page for an information (already existed)
		//List all available blog posts.
		//This is my base url 
		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType("application/json").body(js.toJSONString()).when().get("/posts").then().statusCode(200).log().all();
		
		
	}
	
	@Test
	public void GetRetrivePost() {
		////get - requesting a web page for an information (already existed)
		//Retrieve a post by passing an integer ID
		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType("application/json").body(js.toJSONString()).when().get("/posts/1").then().statusCode(200).log().all();
		
		
	}
	
	
	
	@Test
	public void GetListBlogComment() {
		//get - requesting a web page for an information (already existed)
		//List all blog comments.

		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType("application/json").body(js.toJSONString()).when().get("/comments").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void GetRetrieveComment() {
		//get - requesting a web page for an information (already existed)
		//Retrieve a comment by passing a numeric/alphanumeric ID.
		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType("application/json").body(js.toJSONString()).when().get("/comments/1").then().statusCode(200).log().all();
	}
	
	@Test
	public void PostLoginFailed() {
		
		//Login with a failed attempt (using 'fail' in the password).
		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType(ContentType.JSON).queryParam("username","user123")
		.queryParam("password", "fail")
		.when().post("/login").then().statusCode(401).log().all();
	}
	
	@Test
	public void PostLoginSuccessful() {
		
		//Login successfully and generate a JWT token.
		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType(ContentType.JSON).queryParam("username","michael")
		.queryParam("password", "success-password")
		.when().post("/login").then().statusCode(200).log().all();
	
		
	}
	
	@Test
	public void GetDefaultResponse() {
		//Retrieve default metadata about the API.

		RestAssured.baseURI="https://json-placeholder.mock.beeceptor.com";
		JSONObject js = new JSONObject();
		given().contentType("application/json").body(js.toJSONString()).when().get("/").then().statusCode(200).log().all();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

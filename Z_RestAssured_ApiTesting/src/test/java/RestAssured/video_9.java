package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class video_9 {
	
	@Test
	public void Test5() {
		baseURI="http://localhost:3000";
		given().
		      get("/person1").
		then().
		      statusCode(200).log().all();
	
		
	}
	
	@Test
	public void post() {
		JSONObject request=new JSONObject();
		request.put("first", "Harish");
		request.put("last", "Veerapoor");
		
		baseURI="http://localhost:3000";
		
		given().
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  post("/person1").
		then().
		  statusCode(201);
	}
	
	
	
	@Test
	public void put() {
		JSONObject request=new JSONObject();
		request.put("first", "hari");
		request.put("last", "veerapur");
		
		baseURI="http://localhost:3000";
		
		given().
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  put("/person1").
		then().
		  statusCode(201);
	}
	
	@Test
	public void delete() {
		JSONObject request=new JSONObject();
		request.put("first", "Harish");
		request.put("last", "Veerapoor");
		
		baseURI="http://localhost:3000";
		
		given().
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  delete("/person1").
		then().
		  statusCode(201);
	}
	}


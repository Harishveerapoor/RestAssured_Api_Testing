package RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class video_6 {
	@Test
	public void Test3() {
		baseURI="https://reqres.in/api";
		given().
		   get("/users?page=2").
		then().
		   statusCode(200).
		   body("data[4].first_name", equalTo("George")).
		   body("data.first_name", hasItems("George","Rachel"));
	}
	
	@Test
	public void Test4() {
//		Map<String, Object> map= new HashMap<String, Object>();
//		map.put("name","Harish");
//		map.put("add","veerapoor");
//		System.out.println(map);
		
		// using Json instaed of using map
		
		JSONObject json=new JSONObject();
		json.put("name","Harish");
		json.put("add","veerapoor");
		System.out.println(json.toJSONString());
		
		
		baseURI="https://reqres.in/api";
		given().
		   header("Content-Type","application/json").
		   contentType(ContentType.JSON).accept(ContentType.JSON).
		   body(json.toJSONString()).
		when().
		   post("/users").
			then().
			  statusCode(201);
	
		
}
}
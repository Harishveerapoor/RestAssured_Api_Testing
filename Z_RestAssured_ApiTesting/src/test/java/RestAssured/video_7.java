package RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class video_7 {
	
	@Test
	public void PUT() {
		
		JSONObject json=new JSONObject();
		json.put("name","Harish");
		json.put("add","veerapoor");
		System.out.println(json.toJSONString());
		
		
		baseURI="https://reqres.in";
		given().
		   header("Content-Type","application/json").
		   contentType(ContentType.JSON).accept(ContentType.JSON).
		   body(json.toJSONString()).
		when().
		   put("/api/users/2").
		then().
			  statusCode(200);
	
		
}
	
	

	@Test
	public void PATCH() {
		
		JSONObject json=new JSONObject();
		json.put("name","Harish");
		json.put("add","veerapoor");
		System.out.println(json.toJSONString());
		
		
		baseURI="https://reqres.in";
		given().
		   header("Content-Type","application/json").
		   contentType(ContentType.JSON).accept(ContentType.JSON).
		   body(json.toJSONString()).
		when().
		   patch("/api/users/2").
		then().
			  statusCode(200);


}
	
	
	
	@Test
	public void DELETE() {
		
		JSONObject json=new JSONObject();
		
		baseURI="https://reqres.in";
		given().
		when().
		   delete("/api/users/2").
		then().
			  statusCode(204);

}
}
package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class video_5 {
	@Test
	public void test1() {
		Response re=get("https://reqres.in/api/users?page=2");
		
}
	
	@Test
	public void Test2() {
		baseURI="https://reqres.in/api";
		given().
		    get("/users?page=2").
		then().
		     statusCode(200).
		     body("data[1].id",equalTo(8));
}
	}
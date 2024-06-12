package RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class video_10 {

	
	@Test
	public void Test2() {
		baseURI="https://reqres.in/api";
		given().
		    get("/users?page=2").
		then().
		  assertThat().
		  body(matchesJsonSchemaInClasspath("schema.json")).
		  statusCode(200);
		
		     
}

}

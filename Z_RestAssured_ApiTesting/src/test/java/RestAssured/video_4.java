package RestAssured;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class video_4 {
@Test
public void test1() {
	Response re=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(re.getStatusCode());
	System.out.println(re.getStatusLine());
	System.out.println(re.getTime());
	System.out.println(re.getBody().asString());
	System.out.println(re.getHeader("Content-type"));

	int statuscode=re.getStatusCode();
	AssertJUnit.assertEquals(statuscode, 200);
}
}

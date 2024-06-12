package RestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import org.apache.commons.io.IOUtils;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;

import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class video_11 {

	@Test
	public void Soap_XML() throws IOException {
		
		File file = new File("./SoapRequest/Add.xml");
		
		if(file.exists()) {
			System.out.println("print");
		}
		
		
		FileInputStream fileinput= new FileInputStream(file);
	    String requestbody=IOUtils.toString(fileinput,"UTF-8");
		
		baseURI = "http://www.dneonline.com";
		
		given().
		   contentType("text/xml").
		   accept(ContentType.XML).
		   body(requestbody).
		when().
		   post("/calculator.asmx").   
		then().
		   statusCode(200).log().all().
		and().
		   body("//*:AddResult.text", equalTo("5"));
	}
}

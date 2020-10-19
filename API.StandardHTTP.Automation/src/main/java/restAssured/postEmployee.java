package restAssured;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class postEmployee {

	public static void main(String[] args) {
		
		// given - all input details
		// when - Submit the API -resource,http method
		// Then - validate the response
		
		
		RestAssured.baseURI = "http://dummy.restapiexample.com";
	String response=given().header("Content-Type", "application/json")
		.body(" {\r\n" + 
				"    \"name\": \"test11\",\r\n" + 
				"    \"salary\": \"1213\",\r\n" + 
				"    \"age\": \"213\"\r\n" + 
				"}  ")
		.when().post("/api/v1/create")
		.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
			
		
	}

}

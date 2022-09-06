package API_AutomationPractise;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_AutomationPractise_JSON {

	public static void main(String[] args) 
	{
		/* URL = BaseURI + (Parameter Path (or) Query Path)
		
		URL = https://reqres.in/api/users?page=2 
		BaseURI = https://reqres.in/
		ParameterPath or Query Path =/api/users?page=2		*/
		
		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/users?page=2");
		String responseBody = response.asString();
		int statusCode = response.getStatusCode();
		
		System.out.println("Response Body: "+responseBody);
		System.out.println("Response StatusCode: "+statusCode);
	}
}

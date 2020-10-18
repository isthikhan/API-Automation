package unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class getEmployeeunitrest {

	public void getEmployee() throws UnirestException {

		HttpResponse<JsonNode> jsongetresponse = Unirest.get("http://dummy.restapiexample.com/api/v1/employees")
				.asJson();

		System.out.println("status code is" + jsongetresponse.getStatus());
		System.out.println("status Message is" + jsongetresponse.getStatusText());
		System.out.println("Response Body is" + jsongetresponse.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		getEmployeeunitrest getunitEmployee = new getEmployeeunitrest();
		getunitEmployee.getEmployee();

	}

}

package unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class putEmployeeunitrest {
	public void putEmployee() throws UnirestException {

		HttpResponse<JsonNode> jsongetresponse = Unirest.put("	http://dummy.restapiexample.com/api/v1/update/6861")
				.body("{\"name\":\"demeoqqqqone\",\"salary\":\"1222224\",\"age\":\"43\"}").asJson();

		System.out.println("status code is" + jsongetresponse.getStatus());
		System.out.println("status Message is" + jsongetresponse.getStatusText());
		System.out.println("Response Body is" + jsongetresponse.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		putEmployeeunitrest employeeput = new putEmployeeunitrest();

		employeeput.putEmployee();
	}

}

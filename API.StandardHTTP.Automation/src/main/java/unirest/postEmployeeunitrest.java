package unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class postEmployeeunitrest {

	public void postEmployee() throws UnirestException {

		HttpResponse<JsonNode> jsongetresponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"demewwwqne\",\"salary\":\"1222223\",\"age\":\"43\"}").asJson();

		System.out.println("status code is" + jsongetresponse.getStatus());
		System.out.println("status Message is" + jsongetresponse.getStatusText());
		System.out.println("Response Body is" + jsongetresponse.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		postEmployeeunitrest postunitemployee = new postEmployeeunitrest();
		postunitemployee.postEmployee();

	}

}

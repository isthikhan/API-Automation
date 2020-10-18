package unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class delEmployeeunitrest {

	
		public void delEmployee() throws UnirestException {

			HttpResponse<JsonNode> jsongetresponse = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/6934").asJson();
			System.out.println("status code is" + jsongetresponse.getStatus());
			System.out.println("status Message is" + jsongetresponse.getStatusText());
			System.out.println("Response Body is" + jsongetresponse.getBody());
		}
	
	
	public static void main(String[] args) throws UnirestException {
		delEmployeeunitrest employeedelete = new delEmployeeunitrest();
		employeedelete.delEmployee();
	}

}

package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class getEmployee {

	public void getMethodExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int statuscode = connection.getResponseCode();
		System.out.println("status code is" + statuscode);

		String message = connection.getResponseMessage();
		System.out.println("Response Message is" + message);

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstream);

		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferReader.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		getEmployee employeedetails = new getEmployee();
		employeedetails.getMethodExample();
	}
}
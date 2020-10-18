package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class putEmployee {
	public void putMethodExample() throws IOException {
		URL url = new URL("	http://dummy.restapiexample.com/api/v1/update/6934");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String JsonBody= "{\"name\":\"demeoqqqqone\",\"salary\":\"1222223\",\"age\":\"22\"}";
		byte[] inputJson=JsonBody.getBytes();
		
		OutputStream outputstream= connection.getOutputStream();
		outputstream.write(inputJson);
		
		
		System.out.println("status code is" + connection.getResponseCode());
		System.out.println("Response Message is" + connection.getResponseMessage());
		
		
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
		// TODO Auto-generated method stub
		putEmployee employeedetails = new putEmployee();
		employeedetails.putMethodExample();
	}

}

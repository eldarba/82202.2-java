package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApplicationClient {

	public static void main(String[] args) {
		
		// make request to: http://192.168.0.51:8080/api/greet
		
		System.out.println("hello from client app");
		
		RestTemplate rt = new RestTemplate();
//		String url = "http://192.168.0.51:8080/api/greet";
		String url = "http://localhost:8080/api/greet";
		
//		// get the response body only
//		String resp = rt.getForObject(url, String.class);
//		System.out.println(resp);

		// get the response
		
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		System.out.println(response);
		System.out.println(response.getStatusCodeValue());
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());

	}

}

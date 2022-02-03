package app.core;

import org.springframework.web.client.RestTemplate;

public class ApplicationClient2 {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String url;
		
		url = "http://localhost:8080/api/add-name";
//		rt.postForObject(url, "Lea", Void.class);
//		rt.postForObject(url, "Dan", Void.class);
//		rt.postForObject(url, "Ruth", Void.class);
		
		url = "http://localhost:8080/api/find-name/1";
		String name = rt.getForObject(url, String.class);
		System.out.println(name);

//		

	}

}

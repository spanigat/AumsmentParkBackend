//package com.example.demo;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//import com.example.demo.*;
//
//import junit.framework.Assert;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.RestTemplate;
//
//@SpringBootTest
//class DemoApplicationTests {
//
//	@Test
//	public void testAddEmployeeMissingHeader() throws URISyntaxException 
//	{
//	    RestTemplate restTemplate = new RestTemplate();
//	    final String baseUrl = "http://localhost:8080/employee";
//	    URI uri = new URI(baseUrl);
//	    Employee employee = new Employee("Adam", "Gilly", "test@email.com");
//	     
//	    HttpHeaders headers = new HttpHeaders();
//	 
//	    HttpEntity<Employee> request = new HttpEntity<>(employee, headers);
//	     
//	    try
//	    {
//	        ResponseEntity<String> result=restTemplate.postForEntity(uri, request, String.class);
//	        System.out.println(result);
//	        Assert.assertEquals("success", result.getBody());
//	    }
//	    catch(HttpClientErrorException ex) 
//	    {
//	        //Verify bad request and missing header
//	        Assert.assertEquals(400, ex.getRawStatusCode());
//	        Assert.assertEquals(true, ex.getResponseBodyAsString().contains("Missing request header"));
//	    }
//	}
//
//}

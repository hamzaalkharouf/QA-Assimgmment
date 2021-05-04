package TestClasses;

import static org.junit.Assert.assertTrue;

import java.net.HttpURLConnection;

import org.junit.Test;

import Links.FilesPaths;
import Links.URLs;
import Utils.JSONUtils;
import enums.HTTPMethod;
import enums.HTTPRequestsContentTypes;
import requestHandling.RestClientHandler;

public class TestPostRestAPI {
	@Test
	public void testCreate() throws Exception {
		System.out.println("\nPOST----------------testCreate-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPI;
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.POST,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.CreateUserJSONFile);
		System.out.println(resquestJSONObject);

		
		// 3. Post Request
		RestClientHandler.sendPost(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		String response = RestClientHandler.readResponse(connection);
		System.out.println(response);
		assertTrue( connection.getResponseCode() == 201);		
	}
	
	@Test
	public void testregisterSuccessful() throws Exception {
		System.out.println("\nPOST----------------testregisterSuccessful-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPIregister;
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.POST,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.registerSuccessfulJSONFile);
		System.out.println(resquestJSONObject);

		
		// 3. Post Request
		RestClientHandler.sendPost(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		String response = RestClientHandler.readResponse(connection);
		System.out.println(response);
		assertTrue( connection.getResponseCode() == 200);		
	}
	@Test
	public void testregisterUnSuccessful() throws Exception {
		System.out.println("\nPOST----------------testregisterUnSuccessful-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPIregister;
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.POST,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		
		System.out.println(FilesPaths.registerUnSuccessfulJSONFile);

		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.registerUnSuccessfulJSONFile);
		System.out.println(resquestJSONObject);

		
		// 3. Post Request
		RestClientHandler.sendPost(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		assertTrue( connection.getResponseCode() == 400);		
	}
	
	
	
	@Test
	public void testLoginSuccessful() throws Exception {
		System.out.println("\nPOST----------------testLoginSuccessful-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPIlogin;
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.POST,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		

		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.loginSuccessfulJSONFile);
		System.out.println(resquestJSONObject);

		
		// 3. Post Request
		RestClientHandler.sendPost(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		assertTrue( connection.getResponseCode() == 200);		
	}
	
	@Test
	public void testLoginUnSuccessful() throws Exception {
		System.out.println("\nPOST----------------testLoginUnSuccessful-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPIlogin;
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.POST,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		

		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.loginUnSuccessfulJSONFile);

		
		// 3. Post Request
		RestClientHandler.sendPost(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		assertTrue( connection.getResponseCode() == 400);
	}
	
	
}

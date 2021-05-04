package TestClasses;

import static org.junit.Assert.assertTrue;

import java.net.HttpURLConnection;

import org.junit.Ignore;
import org.junit.Test;

import Links.FilesPaths;
import Links.URLs;
import Utils.JSONUtils;
import enums.HTTPMethod;
import enums.HTTPRequestsContentTypes;
import requestHandling.RestClientHandler;

public class TestPutRestAPI {
	
	@Ignore 
	@Test
	public void testUpdateUser() throws Exception {
		System.out.println("\nPUT----------------testUpdateUser-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPI+"/2";
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.PUT,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.UpdateUserJSONFile);
		
		System.out.println(resquestJSONObject);
		// 3. Post Request
		RestClientHandler.sendPut(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		String response = RestClientHandler.readResponse(connection);
		System.out.println(response);
		
		assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
	}
	@Test
	public void testyUpdateUser() throws Exception {
		System.out.println("\nPUT----------------UpdateUserjustoneJSONFile-------------------");

		// 1. Open Connection --- HttpURLConnection
		String url = URLs.ReqResAPI+"/2";
		
		HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.PUT,
				HTTPRequestsContentTypes.JSON);
		// 2. Prepare Json Object
		String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.UpdateUserjustoneJSONFile);
		
		System.out.println(resquestJSONObject);
		// 3. Post Request
		RestClientHandler.sendPut(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
		// 4. Reading Response
		System.out.println(connection.getResponseCode());
		String response = RestClientHandler.readResponse(connection);
		System.out.println(response);
		
		assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
	}
}

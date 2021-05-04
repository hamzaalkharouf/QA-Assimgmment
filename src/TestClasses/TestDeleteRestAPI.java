package TestClasses;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import Links.FilesPaths;
import Links.URLs;
import Utils.JSONUtils;
import enums.HTTPMethod;
import enums.HTTPRequestsContentTypes;
import requestHandling.RestClientHandler;

public class TestDeleteRestAPI {
	@Test
	public void TestRestClientHandler() throws Exception {
	System.out.println("\nDELETE----------------TestDelete-------------------");

	// 1. Open Connection --- HttpURLConnection
	String url = URLs.ReqResAPI+"/2";
	
	HttpURLConnection connection = RestClientHandler.connectServer(url, HTTPMethod.DELETE,
			HTTPRequestsContentTypes.JSON);
	// 2. Prepare Json Object

	String resquestJSONObject = JSONUtils.readJSONObjectFromFile(FilesPaths.DeleteUserJSONFile);
	System.out.println(resquestJSONObject);

	
	// 3. Post Request
	RestClientHandler.sendDelete(connection, resquestJSONObject, HTTPRequestsContentTypes.JSON);
	// 4. Reading Response
	System.out.println(connection.getResponseCode());
	
	String response = RestClientHandler.readResponse(connection);
	System.out.println("{"+response+"}");
	assertTrue( connection.getResponseCode() == 204);
	


}
}

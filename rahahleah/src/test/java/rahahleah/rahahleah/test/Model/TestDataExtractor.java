package rahahleah.rahahleah.test.Model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import rahahleah.rahahleah.Model.DataExtractor;

public class TestDataExtractor {
	
	@Test
	public void testGenerateJsonParametersToUrl(){
		Map<String, Object> Keys = new HashMap<String,Object>();
		Keys.put("Key1", "value1");
		Keys.put("Keys2", "value2");
		DataExtractor dex=new DataExtractor();
		assertEquals("sucessfully generated a new Json URL with addding a specifed parameters)",
		"&Key1=value1&Keys2=value2",dex.generateJsonParametersToUrl(Keys));		
	}
	@Test
	public void testGetResults() throws MalformedURLException, IOException{
		Map parameters=new HashMap<String, Object>(); 
		parameters.put("destinationCity", "Amman");
		assertEquals("sucessfully returned the filterd results",
		"Amman",new DataExtractor().getResults(parameters).getOffers().getHotel().get(0).getDestination().getCity() );		

	}
}

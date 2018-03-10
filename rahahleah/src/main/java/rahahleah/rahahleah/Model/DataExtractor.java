package rahahleah.rahahleah.Model;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;

import rahahleah.rahahleah.Beans.Users;
/*
 * here we define the data which needs to show
 * Author :Abdullah Rahahleah
 */
public class DataExtractor {
	//This is URL for the needed API
	private static final String SERVICE_API = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	/*
	 * Author : Abdullah rahahleah
	 * Here we generate the full URL which is (API URL + filter parameters) and run it at Json side to read the re
	 */
	public Users getResults(Map<String, Object> parameters) throws MalformedURLException, IOException {
		final String fullURL = SERVICE_API + generateJsonParametersToUrl(parameters);
		URL url = new URL(fullURL);
		Users Objects = new Gson().fromJson(new InputStreamReader(url.openStream()), Users.class);
		return Objects;
	}
	/*
	 * Here we prepare the parameters which should be added to the main URL to determine which data needed by JSON 
	 * Author :Abdullah Rahahleah
	 */
	public String generateJsonParametersToUrl(Map<String, Object> Keys) {

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for (Entry<String, Object> pair : Keys.entrySet()) {
			params.add(new BasicNameValuePair((String) pair.getKey(), (String) pair.getValue()));
		}

		String urlForParameters = URLEncodedUtils.format(params, "UTF-8");
		if (!urlForParameters.isEmpty()) {
			urlForParameters = "&" + urlForParameters;
		}
		return urlForParameters;
	}

}

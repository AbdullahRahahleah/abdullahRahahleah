package rahahleah.rahahleah.Controller.filters;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import rahahleah.rahahleah.Model.DataExtractor;
public class DataInjectorFilter implements Filter {
	/*/
	 * author : abdullah rahahleah
	 * In this method we handle every request cam with url /home to read the passed paeameters (if exist)
	 * 
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		HashMap<String, Object> parameters = fillParameters((HttpServletRequest) request);
		request.setAttribute("Objects", new DataExtractor().getResults(parameters));
		chain.doFilter(request, response);
	}
	
	/*
	 * author : abdullah rahahleah
	 * In this method we read the passed parameters and read the pre-defined fields (as mentioned in the array (formFields)
	 *where we define in it the fields which we will work on, and return them as an array
	 */
	private final static String[] formFields={"siteID","currency","minStarRating","maxStarRating","destinationCity","regionIds","minTripStartDate","lengthOfStay"};
	public static HashMap<String, Object> fillParameters(HttpServletRequest req){
		HashMap<String,Object> keys = new HashMap<>();
		for(int i=0;i<formFields.length;i++){
			String Value=req.getParameter(formFields[i]);
			if(Value!=null && !(Value.equals("")))
				keys.put(formFields[i], Value);
		}
		return keys;
		
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
	
}

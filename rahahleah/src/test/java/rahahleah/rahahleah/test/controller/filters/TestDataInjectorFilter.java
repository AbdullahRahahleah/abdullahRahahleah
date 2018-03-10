package rahahleah.rahahleah.test.controller.filters;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import rahahleah.rahahleah.Controller.filters.DataInjectorFilter;

public class TestDataInjectorFilter {
	static MockHttpServletRequest mock;
	
	@Test
	public void testFillParameters() throws Exception{
		mock.setParameter("minStarRating","4" );
		mock.setParameter("maxStarRating","5" );
		assertEquals("sucessfully the parameters read from servlet into array)",
		"{minStarRating=4, maxStarRating=5}",DataInjectorFilter.fillParameters((HttpServletRequest)mock).toString());	
	}
	
	@BeforeClass
	public static void init() throws Exception{
		mock = new MockHttpServletRequest();
		mock.setCharacterEncoding("UTF-8");
	}
	
}

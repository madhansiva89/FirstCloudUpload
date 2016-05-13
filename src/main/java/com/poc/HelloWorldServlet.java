package com.poc;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(HelloWorldServlet.class.getName());

	@Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws IOException {
		String test=null;
	    resp.setContentType("text/plain");
	    resp.getWriter().println("Hello World");
	    /*try {
	    	test.toString();
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception occur", e);
		}
	    try {
	    	Long.parseLong(test);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception occur while converting to long", e);
		}*/
	  }
}

package com.khao.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PageController extends HttpServlet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(PageController.class);

@Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
      
	
	logger.debug("starting servlet..");
    // Use "request" to read incoming HTTP headers (e.g. cookies)
    // and HTML form data (e.g. data the user entered and submitted)
    
    // Use "response" to specify the HTTP response line and headers
    // (e.g. specifying the content type, setting cookies).
	  
	String dbusername = (String) getServletContext().getAttribute("dbuser");
	String dbpassword = (String) getServletContext().getAttribute("dbpassword");  
    PrintWriter out = response.getWriter();
    // Use "out" to send content to browser
    out.println("<h1>HELLO</h1>");
    out.println("<p>" + dbusername + "</p>");
    
    logger.info("dbuser: {} \n dbpassword: {} \n", dbusername,dbpassword);
  }
}
package com.khao.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

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
    
		String requestUrl = request.getRequestURI();
		String servletPath = request.getServletPath();
		
		String view = "";
		
		if(servletPath.equalsIgnoreCase("/products")){
			logger.debug(requestUrl);
			logger.debug(servletPath);
			view = "products";
			logger.debug("dispatcher ok");
			
		}
		else if(servletPath.equalsIgnoreCase("/home")){
			view = "index";
		}
		
		view = view + ".jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
  }
}
package com.khao.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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
    
		String requestUrl = request.getRequestURI();
		String servletPath = request.getServletPath();
		
		String view = "";
		
		if(servletPath.equalsIgnoreCase("/products")){
			logger.debug(requestUrl);
			logger.debug(servletPath);
			view = "/WEB-INF/view/products";
			logger.debug("dispatcher ok");	
		}
		else if(servletPath.equalsIgnoreCase("/home")){
			view = "index";
		}
		else if(servletPath.equalsIgnoreCase("/checkout")){
			view= "checkout";
		}
		else if(servletPath.equalsIgnoreCase("/product_detail")){
			view= "/WEB-INF/view/product_detail";
		}
		
		view = view + ".jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
  }

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doPost(req, resp);
}

  
}
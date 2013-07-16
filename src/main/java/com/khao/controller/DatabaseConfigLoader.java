package com.khao.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DatabaseConfigLoader implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent event) {
	}

	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		//TODO: instead of setting all properties individually, set them as
		//a single object in a context attribute
		/*
		String configFilePath = "C:/Users/alejkb/workspace/khaoweb/src/main/resources/db.properties";
		Properties prop = new Properties();
		
		
		try {
			prop.load(new FileInputStream(configFilePath));
			context.setAttribute("dbuser", prop.getProperty("dbuser"));
			context.setAttribute("dbpassword", prop.getProperty("dbpassword"));
			context.setAttribute("dbdriver", prop.getProperty("dbdriver"));
			context.setAttribute("dbstore", prop.getProperty("dbstore"));
			
			context.setAttribute("dbproperties", prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}

}

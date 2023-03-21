package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pp;
	
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pp = new Properties();
			pp.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}
	}
	
	public String getUrl() {
		String baseURL = pp.getProperty("baseURL");
		return baseURL;
	}
	
	public String getDriver() {
		String Driver = pp.getProperty("Driver");
		return Driver;
	}

}

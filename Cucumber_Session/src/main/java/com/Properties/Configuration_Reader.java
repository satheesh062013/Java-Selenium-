package com.Properties;

import java.io.*;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader 
{
	public Properties p;
	
	public Configuration_Reader() throws IOException 
	{		
		//File f = new File("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\MavenProjectSession\\src\\main\\java\\com\\Properties\\config.properties");
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Properties\\config.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	
	public String getbrowserName()
	{
		String browserName = p.getProperty("browserName");
		return browserName;
	}
	
	public String geturlAddress()
	{
		String urlAddress = p.getProperty("urlAddress");
		return urlAddress;
	}
	
	public String getusername()
	{
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password = p.getProperty("password");
		return password;
	}
		
}

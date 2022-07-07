package com.Properties_LegacyClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.TreeSet;

public class Properties_Demo 
{
	public static void main(String[] args) throws IOException 
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
		"C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Java\\src\\com\\Properties_LegacyClass\\testInput.properties");
		p.load(fis);
		System.out.println(p);
		System.out.println(p.entrySet());
		System.out.println(p.getProperty("Vadai"));
		p.setProperty("Vadai", "5000");
		FileOutputStream fos = new FileOutputStream(
		"C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Java\\src\\com\\Properties_LegacyClass\\testOutput.properties");
		p.store(fos, "Updated Price of Hotel Menu");
		System.out.println(p);
		
		/*java.util.MissingResourceException: Can't find bundle for base name test, locale en_US*/
//		ResourceBundle rb = ResourceBundle.getBundle("test");
//		String bundle = rb.getString("Vadai");
//		System.out.println(bundle);
	}
}

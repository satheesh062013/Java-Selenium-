package com.Properties;

import java.io.IOException;

import com.PageObjectModel_POM_CLasses.LoginPage_Adactin;

public class File_Reader_Manager 
{
	private File_Reader_Manager()
	{
		/* Object Can Not be created in Another class for File_Reader_Manager Class 
		while we specify the Constructor as Private; */
	}
	
	public static File_Reader_Manager getInstanceFRM() //Static Method
	{
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public Configuration_Reader getInstanceCR() throws IOException //Non-Static Method
	{
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
	
}

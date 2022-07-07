package com.Maven_Developer_SelfExercise;

import java.util.ResourceBundle;

public class Developer_Code 
{	
	public int logIn(String USERNAME, String PASSWORD)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String passWord = rb.getString("password");
		
		if(USERNAME.equals(userName) && PASSWORD.equals(passWord))
		{
			System.out.println("USERNAME is Matched: "+ userName);
			System.out.println("PASSWORD is Matched: "+ passWord);
			return 1;
		}
		
		else
		{
			System.out.println("Incorrect USERNAME: " + USERNAME);
			System.out.println("Incorrect PASSWORD: " + PASSWORD);
			return 0;
		}
	}
}

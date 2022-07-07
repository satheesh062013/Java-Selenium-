package com.Maven_Tester_SelfExercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Maven_Developer_SelfExercise.Developer_Code;

public class Tester_Code 
{
		@Test
		public void userLogin1()
		{
			System.out.println("-----------------Test Case1: VALIED Details-----------------");
			Developer_Code dc = new Developer_Code();
			int logInStatus = dc.logIn("satheesh", "satheesh@123");
			Assert.assertEquals(logInStatus, 1, "LogIn Failed");
		}
	
		@Test
		public void userLogin2()
		{
			System.out.println("-----------------Test Case2: IN-VALIED Details-----------------");
			Developer_Code dc = new Developer_Code();
			int logInStatus = dc.logIn("satheesh456", "satheesh@456");
			Assert.assertEquals(logInStatus, 0, "LogIn Failed");
		}
}

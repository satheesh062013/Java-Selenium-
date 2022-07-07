package com.Exception;

import java.util.Scanner;

public class Try_Catch_Finally_Demo 
{
	public static void main(String[] args) 
	{
		division();
	}
	private static void division() 
	{
		float c = 0;
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("Enter the 1st Value:   ");
			int a = sc.nextInt();
			System.out.println("Enter the 1st Value:   ");
			int b = +sc.nextInt();
		c = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException:"+ae.getLocalizedMessage());
			System.out.println(ae.getCause());
		}
		catch(Exception e)
		{
			System.out.println("Exception Caused by :  "+e.getMessage()+"  Check the Input Values");
			System.out.println(e.getCause());		
			}
		finally 
		{
			System.out.println("Division Method has been Called: ");
		}
		
	}
}

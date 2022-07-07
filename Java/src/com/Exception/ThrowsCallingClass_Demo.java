package com.Exception;

import java.util.Scanner;

public class ThrowsCallingClass_Demo extends Throws_Demo
{
	public static void main(String[] args) 
	{
		
		try {
		div();
		}
		catch(Exception e)
		{
			System.out.println("Chech the Values again: ");
			div();
		}
	}
}

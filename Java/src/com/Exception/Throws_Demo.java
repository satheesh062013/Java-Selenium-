package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_Demo 
{
	//@SuppressWarnings("unused")
	public static void div() throws ArithmeticException,InputMismatchException 
	{
		Scanner sc  = new Scanner(System.in);	
		System.out.println("Enter the 1st Value: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Value: ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("Divided Value is: "+c);
	}

}

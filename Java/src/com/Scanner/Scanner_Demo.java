package com.Scanner;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Person Name in Console: ");
	    String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter the Person Age in Console: ");
		int age = sc.nextInt();
		System.out.println(age);
		sc.nextLine();
		
		System.out.println("Enter the Person Country in Console: ");
	    String country = sc.nextLine();
		System.out.println(country);
		
	}

}

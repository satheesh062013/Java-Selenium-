package com.ArrayList_toArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Exercise {

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		char ch='y';
		ArrayList al = new ArrayList();
		
		for(int i=0; ch!='n';i++)
		{
			System.out.println("Enter the Integer Value: ");
			al.add(scanner.nextInt());
			System.out.println("Enter the Condition: ");
			ch=scanner.next().charAt(0);
			System.out.println("Char @ ch is: "+ch);
		}
		System.out.println(al);

	}

}

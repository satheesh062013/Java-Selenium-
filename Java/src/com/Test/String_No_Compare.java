package com.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class String_No_Compare 
{
	
	public static void main(String[] args) 
	{
	Scanner scanner =new Scanner(System.in);
	String S = "Yes";
	int j=0;
	ArrayList al = new ArrayList();
	
	for(int i=0; !S.equals("No");i++)
		
	{
		//System.out.println("Enter the Integer Value: ");
		j=j+100;
		al.add(j);
		System.out.println("Enter the Condition: ");
		S = scanner.nextLine();
		System.out.println("String s Value is: "+S);	
	}
 	System.out.println(al);
 	
 	System.out.println("************************");
 	
  	ListIterator it = al.listIterator();
 	
 	
 			
 	
 	
}
}

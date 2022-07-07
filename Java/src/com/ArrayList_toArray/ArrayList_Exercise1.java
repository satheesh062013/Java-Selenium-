package com.ArrayList_toArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayList_Exercise1 {

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		String S="Yes"; int j=0;
		ArrayList al = new ArrayList();
		for(int i=0; !S.equals("No");i++)
			{
			System.out.println("Enter the Integer Value: ");
			j=j+100;
			al.add(j);
			System.out.println("Enter the Condition: ");
			S = scanner.next();
			//System.out.println("String s Value is: "+S);	
		}
	 	System.out.println(al);
	 	
	 	TreeSet ts = new TreeSet(al);
	 	System.out.println("************************");
	 	
	 	System.out.println(ts);
	 	Iterator it = ts.iterator();
	 	
	 	while(it.hasNext())
	 		
	 	{
	 		System.out.println(it.next());
	 	}
	}
}

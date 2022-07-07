package com.ArrayList_toArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_toArray {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int i=1;
		System.out.println("Enter the Character to Compare: ");
		char ch = scanner.next().charAt(0);
		while(ch=='Y'||ch=='y')
		{
			al.add(i);
			System.out.println("Enter the Character to Terminate the loop:"+i);
			ch=scanner.next().charAt(0);
			i++;
		}
		System.out.println(al);
		Integer ar[]=new Integer[al.size()];
		ar=al.toArray(ar);
		for(int ar1:ar)
			System.out.println(ar1);System.out.println("Size of ArrayList is: "+al.size());
		
		System.out.println("ArrayList 1 Value: "+al.get(1)+"     Array Value of index 2 is: "+ar[2]);
	}
}

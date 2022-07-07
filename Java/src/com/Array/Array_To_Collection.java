package com.Array;

import java.util.HashSet;

public class Array_To_Collection {

	public static void main(String[] args) 
	{
		int a[] = {8,2,3,4,5,6,7,8,9,10}; int temp = 0;
		System.out.println("Array Values: ");
		HashSet hs = new HashSet();
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			hs.add(temp);
			System.out.println(a[i]);
		}
		System.out.println("-------------------Array to Set---------------------- ");
		System.out.println("HashSet Value's are:     "+hs);
	}
}

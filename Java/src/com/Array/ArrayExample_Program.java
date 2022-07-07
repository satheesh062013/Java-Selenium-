package com.Array;

public class ArrayExample_Program 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println("Array Length is: "+a.length);
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}

}

package com.ArrayReverseOrder;

import java.util.Arrays;

public class Print_ArrayIn_ReverseOrder 
{
	public static void main(String[] args) 
	{
		int a[] = {1000,10,10,20000,4,-1,200,100000,-10,-3000,200};
		int b[]= new int[a.length];
		float b1=50.0f;
		int j=0;
		//Integer a1=(Integer) a[3];
		Arrays.sort(a);
		for(int a1:a)
			System.out.println(a1);System.out.println("*******************");
		for(int i=a.length-1;i>=0;i--)
		{//System.out.println(a[i]);
		b[j]=a[i];
		j++;
		}
		for(int k:b)
			System.out.println(k);
	}
}

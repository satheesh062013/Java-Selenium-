package com.Equals;

public class Equals_Demo 
{
	int a,b;
	public static void main(String[] args) 
	{
		Equals_Demo eq = new Equals_Demo();
		Equals_Demo eq1 = new Equals_Demo();
		eq.a=100;eq1.b=100;
		System.out.println("Hashcode of eq Object is:  "+eq.hashCode());
		System.out.println("Hashcode of eq1 Object is:  "+eq1.hashCode());
		System.out.println(eq.equals(eq1));
		if(eq.a==eq1.b)
			System.out.println("Both Objects are Equal");
		else
			System.out.println("Both Objects are NOT Equal");
		System.out.println("*******************************************");
		
		String s1 = "Satheesh";
		String s2 = "Satheesh";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		if(s1==s2)
			System.out.println("Both Strings are Equal & Sharing Same memory location");
		else
			System.out.println("Both Strings are NOT Equal");
		
	}


}

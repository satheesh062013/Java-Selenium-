package com.SelfPractise_Selenium;

public class SelfPractise_String_Reverse 
{
	public static void main(String[] args) 
	{
		String a = "java is programmming language";
		//String Reverse Method 1:
		String reverse = "";
		char a1[] = a.toCharArray();
		for (int i=a.length()-1;i>=0;i--) 
		{
			reverse = reverse+a1[i];
		}
		
		//String Reverse Method 2:
		char a2[]=new char[a.length()];
		int j=0;
		for(int i=a.length()-1;i>=0;i--)
		{
			a2[j]=a1[i];
			j++;	
		}
		String reverse1 = String.valueOf(a2);
		
		//String Reverse Method 3:
		String reverse2 = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse2 = reverse2+a.charAt(i);
		}
		
		
		System.out.println("Before String Reverse: "+a);
		System.out.println("After String Reverse(Method1) : "+reverse);
		System.out.println("After String Reverse(Method2) : "+reverse1);
		System.out.println("After String Reverse(Method3) : "+reverse2);	
		System.out.println("Does both reverse String methods works in Same way? "+reverse.equals(reverse2));
	}
}

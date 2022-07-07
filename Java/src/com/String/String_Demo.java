package com.String;

public class String_Demo 
{

	public static void main(String[] args) 
	{
		String name = "Satheesh ";
		System.out.println("Length of String is: "+name.length());
		System.out.println("Character at Index 7: "+name.charAt(7));
		System.out.println("compareTo Output1: "+name.compareTo("satheesh"));
		System.out.println("compareTo Output2: "+name.compareTo("Satheesh"));
		System.out.println("compareTo Output3: "+name.compareTo("Saatheesh"));
		System.out.println("Check String Equals: "+name.equals("Satheesh"));
		System.out.println("toUpperCase: "+name.toUpperCase());
		System.out.println("toLowerCase: "+name.toLowerCase());
		name=name.replaceAll(" ", "kumar");
		System.out.println(name);
		System.out.println("String Concatenation: "+name.concat(" Sekar"));
		System.out.println("Contains Function: "+name.contains("K"));
		
		char ch[]=name.toCharArray();
		
		int i=name.length()-1;
		char ch1[]=new char[ch.length];
		
		for(int j=0;j<ch.length;j++)
		{
			ch1[j]=ch[i];
			i--;
		}
		System.out.print("Print the String in Reverse: ");
		for(char ch2:ch1)
			System.out.println(ch2);
			
	}

}

package com.String;

public class Literal_And_NonLiteral_String 
{
	public static void main(String[] args) 
	{
		String s1 ="JavaProgram";				//Literal String in SCP
		String s2 = s1;							//Literal String(s2=s1) in SCP
		String s3 = new String("JavaProgram");	//Non-Literal String inside HEAP MEMORY
		String s4 = "Java"+"Program"; 
		String s51=new String("Java"); //s2=null;
		String s5 = s51+"Program"; 
		String s6 = new String("JavaProgram");
		System.out.println("Identity Hashcode of s1: "+System.identityHashCode(s1));
		System.out.println("Identity Hashcode of s2: "+System.identityHashCode(s2));
		System.out.println("Identity Hashcode of s3: "+System.identityHashCode(s3));
		System.out.println("Identity Hashcode of s4: "+System.identityHashCode(s4));
		System.out.println("Identity Hashcode of s5: "+System.identityHashCode(s5));
		System.out.println("Identity Hashcode of s6: "+System.identityHashCode(s6));
		System.out.println("Hashcode of s1: "+s1.hashCode());
		System.out.println("Hashcode of s2: "+s2.hashCode());
		System.out.println("Hashcode of s3: "+s3.hashCode());
		System.out.println("Hashcode of s4: "+s4.hashCode());
		System.out.println("Hashcode of s5: "+s5.hashCode());
		System.out.println("Hashcode of s6: "+s6.hashCode());
		if(s1==s3)
			System.out.println("Both the Strings s1&s3 are: == ");
		else
			System.out.println("Both the Strings s1&s3 are: != ");
		if(s3.equals(s5))
			System.out.println("Both the Strings s3&s5 are: EQUAL ");
		else
			System.out.println("Both the Strings s3&s5 are: NOT EQUAL ");
		System.out.println("---------------------------------------------------------------------");
	}

}

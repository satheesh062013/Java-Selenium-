package com.Inheritance;

public class SocialMedia_Parent 
{
	static int age =21;
	static short min_short = -32768;
	final float pi = 3.14f;
	private static byte max_byte = 127;
	public static short max_short = 32767;
	protected int salary = 6000;
	
	public static void message(String statement)
	{		
		System.out.println(statement);	
	}
	public void information() 
	{
		System.out.println("SocialMedia_Parent Class---> public information(): ");
	}
	@SuppressWarnings("unused")
	private void video()
	{
		System.out.println("SocialMedia_Parent Class---> Private Video(): ");
	}
	static
	{
		System.out.println("SocialMedia_Parent Class---> static Block: ");
	}
	{
		System.out.println("SocialMedia_Parent Class---> Non static Block");
	}

}

package com.Variables;

public class Static_Variables 
{
	int a=100;
	static int b=200;
	
	public void add() //Static & Non-Static Variables Can be Used in Non-Static Method()
	{
		Static_Variables aa = new Static_Variables();aa.a=0;
		System.out.println(a);
		System.out.println(b);
		main();//Static Method's can be Called Inside any Static & NonStatic methods()
	}
	
	public static void mul() //Only Static Variables can be Called Directly inside Static Method;
	{
		Static_Variables ab = new Static_Variables();
		System.out.println(ab.a);
		//System.out.println(a); //Non-Static Variables Can not be Called Directly in Static Method.
		System.out.println(b);main();
	}

	public static void main(String[] args) 
	{
		Static_Variables ac = new Static_Variables();
		System.out.println(ac.a);
		System.out.println(b);
		ac.add();  //Non-Static methods can be called only by Object
		main();
		Static_Variables.mul();
	}
	
	public static void main() //Main Method Overloading
	{
		Static_Variables aa = new Static_Variables();
		//System.out.println(a); //Non-Static Variables Can not be Called Directly in Static Method.
		System.out.println(b);

	}

}

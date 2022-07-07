package com.Interface;

public class Interface_ImplementingClass implements Child_Interface 
//All the methods in Parent & Child Interface has to be OVERRIDE here
{

	public static void main(String[] args) 
	{
		Interface_ImplementingClass iic = new Interface_ImplementingClass();
		
		//Child_Interface iic = new Interface_ImplementingClass();
				
		System.out.println(iic.a); //Calling Parent Interface's Class variable inside of Implementing Class
		
		
		iic.add();
		
		System.out.println(ParentInterface.a);
	}

	@Override
	public void add() //Parent Interface Method
	{
		System.out.println("Parent Interface add() Method");
	}
	
	@Override
	public void sub() //Parent Interface Method
	{
		System.out.println("Parent Interface sub() Method");
	}

	@Override
	public void add(int i)  //Child Interface Method
	{
		System.out.println("Child Interface add(int) Method");
	}

	@Override
	public void sum() //Child Interface Method
	{
		System.out.println("Child Interface sum() Method");
	}

	@Override
	public void mul(int a, int b) //Child Interface Method
	{
		System.out.println("Child Interface mul(int,int) Method");
	}

	

}

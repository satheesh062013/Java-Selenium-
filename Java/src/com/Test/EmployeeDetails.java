package com.Test;

public class EmployeeDetails extends ParentOfEmployeeDetails{
	
 int b=50;
 
	public EmployeeDetails (int b)
	
	{		
		super(20);
		this.b = b;
		System.out.println("I am a Child Class Constructor with 01 Arg[]: "+this.b);
	}
	

	public static void main(String args[]) 
	{
		int a=500;String s;
		EmployeeDetails ed = new EmployeeDetails(a);
		ed.debit();
		System.out.println(ed);
	}
	
	{this.b=20000;System.out.println("++++"+this.b);}

}

package com.Basics;
public class Student_Details extends Employee_Details
{
	static											// Static Block
	{
		System.out.println("I am a Static Block Output");
	}
	/*static     									//Multi-Line Comment
	{
		System.out.println("I am a Static Block2 Output");
	}*/
	{												//Non-Static Block
	System.out.println("I am a Non-Static Block output");
	}
	public static void main(String[] args) 			// main method
	{
		Student_Details std = new Student_Details();
		System.out.println("Value of 'a' from Employee_Details Class is:"+std.a);
		std.employeeCompany();
		std.employeeName();
		std.employeeAge();
	}

}

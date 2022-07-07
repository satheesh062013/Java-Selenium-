package com.Test;

public class ParentOfEmployeeDetails implements ClassInterface{
	
	int b=10;

	public ParentOfEmployeeDetails() 
		{
		System.out.println("I am a SuperClass Constructor with NO ARGS[]: ");	
		}
	public ParentOfEmployeeDetails(int a) 
		{
		System.out.println("I am a SuperClass Constructor with 01 No. of ARGS[]: "+a);	
		}
	
	
	@Override
	public void debit() 
		{
		System.out.println("I am from a Debit Abstract method: ");	
	
		}
		
	
}

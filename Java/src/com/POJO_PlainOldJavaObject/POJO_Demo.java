package com.POJO_PlainOldJavaObject;

public class POJO_Demo 
{
	private int age = 33;
	private String name = "Satheesh";
	
	public int getAge()
	{
		return this.age;
		
	}
	public void setAge(int s)
	{
		this.age=s;
	}
	public String getName()
	{
		return this.name;
		
	}
	public void setName(String s)
	{
		this.name=s;
	}
	public static void main(String[] args) 
	{
		POJO_Demo pj = new POJO_Demo();
		System.out.println("getter age: "+pj.age);
		System.out.println("getter Name: "+pj.name);
	}
}

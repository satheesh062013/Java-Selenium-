package com.KeyWords;
public class Final_Keyword_ChildClass extends Final_Keyword_ParentClass
{
	@Override
	public void div(int b)
	{
		super.div(5000);
		System.out.println("Child Class---> Div method: "+b);
	}
	public void info()
	{
		System.out.println("Child Class---> No Parameter Method:");
	}
	public void info(int a)
	{
		this.info();
		System.out.println("Child Class---> One Parameter Method: "+a);
	}
	public static void main(String[] args) 
	{
		Final_Keyword_ChildClass cc = new Final_Keyword_ChildClass();
		cc.div(1000);
		cc.info(10);
		//cc.a=100;		//final Variable(Parent Class)
		System.out.println(cc.a);
		
	}
}

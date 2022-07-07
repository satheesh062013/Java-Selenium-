package com.Inheritance;

public class SocialMedia_Child1 extends SocialMedia_Child
{
	public void whatsApp()
	{
		super.whatsApp();
		System.out.println("SocialMedia_---Child1 Class---> WhatsApp");
	}
	public void whatsApp(int a)
	{
		this.whatsApp();
		System.out.println("SocialMedia_---Child1 Class---> One Parameter WhatsApp");
	}
	public void sum() 
	{
		System.out.println("sum method Overloading: No Parameter: ");
	}
	public void sum(int a) 
	{
		System.out.println("sum method Overloading: One int Parameter Pass:a "+a);
	}
	public void sum(int a,int b) 
	{
		System.out.println("sum method Overloading: Two int Parameter Pass:a "+a+"    b:  "+b);
	}
	public void sum(float f) 
	{
		System.out.println("sum method Overloading: One float Parameter Pass:f "+f);
	}
	public void sum(String name) 
	{
		System.out.println("sum method Overloading: One String Parameter Pass:Name "+name);
	}

	public static void main(String[] args) 
	{
		SocialMedia_Child1 smc1 = new SocialMedia_Child1();
		
		smc1.information();
		smc1.whatsApp();
		smc1.whatsApp(1000);
		
		smc1.sum();
		smc1.sum(10);
		smc1.sum(100, 200);
		smc1.sum(500.00f);
		smc1.sum("Satheeshkumar");
	
	}

}

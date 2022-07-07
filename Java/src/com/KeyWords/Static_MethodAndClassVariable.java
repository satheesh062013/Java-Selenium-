package com.KeyWords;

public class Static_MethodAndClassVariable 
{
	static int a=3010,b=90;

	public static void add()
	{
		int a=-1000;
		int b=-9000;
//		a=this.a;
//		b=this.b;
		System.out.println("a is: "+a+"  b is: "+b+" a+b is: "+(a+b));
	}
	
	public static void mul(int a, int b)
	{
		System.out.println("a is: "+a+"  b is: "+b+" axb is: "+Math.multiplyExact(a, b));
	}
	
	public static void main(String[] args) 
	{
		Static_MethodAndClassVariable smcv = new Static_MethodAndClassVariable();
		
		add();
		mul(500,100);

	}

}

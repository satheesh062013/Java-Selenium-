package com.Test;

import com.AbstractClass_Interface_Constructor_Scanner.AbstractDemo;
import com.AbstractClass_Interface_Constructor_Scanner.Interface1_Demo;

public class Test implements Interface1_Demo{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test t1 = new Test();
		
		int b =t1.b;
		System.out.println(b);
		System.out.println(t1.mul(5, 10));
		
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	

}

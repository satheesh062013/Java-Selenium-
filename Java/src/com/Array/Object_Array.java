package com.Array;

public class Object_Array 
{

	public static void main(String[] args) 
	{
		Object a[]= {1,2,'S',"123",10.0005,true,false,"Saikutty",1000,-0.100};
		for(Object a1:a)
		System.out.println(a1);
		Object a2 = "123";
		Integer b=Integer.parseInt((String)a2);
		b=b+7;
		System.out.println(b);
		String string = b.toString();
		
		System.out.println(string+130);
		System.out.println(string.valueOf(b)+200);
		
		Object d = (Object) string;
		System.out.println(d);
	}

}

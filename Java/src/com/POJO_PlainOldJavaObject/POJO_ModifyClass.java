package com.POJO_PlainOldJavaObject;

public class POJO_ModifyClass 
{
	public static void main(String[] args) 
	{
		POJO_Demo pj = new POJO_Demo();
		System.out.println(pj.getName());
		System.out.println(pj.getAge());
		pj.setName("Saikutty");
		pj.setAge(5);
		System.out.println("************After details Modified************");
		System.out.println(pj.getName());
		System.out.println(pj.getAge());
	}
}

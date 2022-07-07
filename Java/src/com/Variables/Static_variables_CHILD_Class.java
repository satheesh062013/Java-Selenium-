package com.Variables;

public class Static_variables_CHILD_Class extends Static_Variables 
{
	static Static_variables_CHILD_Class sv;
	public static void main(String[] args) 
	{
		Static_variables_CHILD_Class sv1 = new Static_variables_CHILD_Class();
		System.out.println(sv1.a);  
		System.out.println(sv.a);  //Null Pointer Exception
		System.out.println(b);
	}
	
	public void del()
	{
		System.out.println(a);

		System.out.println(b);
	}

}

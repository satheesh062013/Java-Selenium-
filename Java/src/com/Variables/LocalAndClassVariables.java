package com.Variables;

public class LocalAndClassVariables 
{
	int i=10, j=20;

	public void add(int i, int j)
	{
		System.out.println("\nValue of Local method's i is:  "+i+"   j is:  "+j);
		System.out.println("\nAdded Value of local i+j is: "+(i+j)+"\n");
	}
	public static void main(String[] args) 
	{
		LocalAndClassVariables lcv = new LocalAndClassVariables();
		lcv.add(500,500);
		System.out.println("Value of Class Variable i is:  "+lcv.i+"   j is:  "+lcv.j);
	}

}

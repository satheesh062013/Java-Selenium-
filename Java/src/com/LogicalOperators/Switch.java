package com.LogicalOperators;
public class Switch 
{
	public static void main(String[] args) 
	{
		String month = "dece";
		switch(month)
		{
			case "jan":
				System.out.println("The Entered Month is January: ");
				break;
			case "feb":
				System.out.println("The Entered Month is February: ");
				break;
			case "dec":
				System.out.println("The Entered Month is December: ");
				break;
			default:
				System.out.println("The Entered month does Not match with the List: ");
		}
	}
}

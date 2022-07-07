package com.JumpingStatement;

public class Continue_And_Break 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			if(i==5)
			{
				System.out.println("I don't Print "+i);
				continue;
			}
			else if(i==12)
			{
				System.out.println("Exited from the Loop, Bye Bye:) ");
				break;
			}
			else
				System.out.println(i);
		}
	}
}

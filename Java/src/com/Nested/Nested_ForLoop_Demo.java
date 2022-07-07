package com.Nested;

public class Nested_ForLoop_Demo 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=20;i++)
		{
			if(i==1)
				{
				System.out.println("*************************************************");
				System.out.println("*Multiplied Value of i & j only if Both are Same*");
				System.out.println("*************************************************");
				}
			for(int j=1;j<=20;j++)
			{
				if(i==j)
				{
					int c=i*j;
					System.out.println(c);
				}
			}
						
		}
	}

}

package Exercise_Programs;

import java.util.Scanner;

public class SelfPractise_PrintNumbersInTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		int b=a;int temp=a;
		for(int i=1;i<=a;i++)
		{
			for(int j=temp;j>0;j--)
			{
				System.out.print("\t");
			}
			temp=temp-1;
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+"\t");
				
				if(k==i && k>1)
				{
					k=k-1;
					for(int k1=k;k1>0;k1--)
					{
						System.out.print(k1+"\t");
					}
					break;
				}
			}
			System.out.println("\n");	
		}
	}

}

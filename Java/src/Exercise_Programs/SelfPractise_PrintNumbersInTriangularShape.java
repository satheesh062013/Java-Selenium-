package Exercise_Programs;

import java.util.Scanner;

public class SelfPractise_PrintNumbersInTriangularShape 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Row's to be printed: ");
		int rows=scanner.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<=rows-i;k++)
				System.out.print("\t"); //For the Outer Triangle Space
			for(int j=1;j<=i;j++)
				System.out.print(j+"\t\t"); //For the Inner Number Space
			System.out.println("\n");
		}
	}
}

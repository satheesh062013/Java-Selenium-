package Exercise_Programs;

import java.util.Arrays;

public class SelfPractise_Ascending_And_Descending_Order 
{
	public static void main(String[] args) 
	{
		int a[]= {10,9,8,4,1,6,7,4,9,5};
		Arrays.sort(a);
		
		//Ascending Order
		System.out.println("****************************");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		System.out.println("****************************");
		//Descending Order
		for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
		System.out.println("****************************");
	}
}

package Exercise_Programs;

import java.util.Arrays;

public class Interview_Aspire_ArraySorting_SumOfAndArrayElements 
{
	public static void main(String[] args) 
	{
		int b=0;
		int a[]= {1,5,100,100,250,500,8000,-100};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			b = b+a[i];
		}
		System.out.println("First largest No is: "+a[a.length-1]);
		System.out.println("Second largest No is: "+a[a.length-2]);
		System.out.println("Added Value of Array is: "+b);
	}
}

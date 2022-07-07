package Exercise_Programs;

import java.util.Scanner;

public class SelfPractise_FibbanociSeries {

	public static void main(String[] args) {
		
		int a=1,b=2;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=5;i++) 
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}

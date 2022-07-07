package Exercise_Programs;

public class SelfPractise_Factorial 
{
	public static void main(String[] args) 
	{
		int a=5;
		long fact=1;
		
		for (int i = a; i>0; i--) 
		{	
			fact = fact*i;
			System.out.println(fact);
		}
		System.out.println("Factorial of "+a+" is: "+fact);
	}
}

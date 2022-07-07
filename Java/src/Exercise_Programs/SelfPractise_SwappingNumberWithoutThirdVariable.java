package Exercise_Programs;

public class SelfPractise_SwappingNumberWithoutThirdVariable 
{
	public static void main(String[] args) 
	{
		int a=100,b=200;
		System.out.println("*****Before Swapping*****");
		System.out.println("Value of a is: "+a+"   Value of b is: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("*****After Swapping*****");
		System.out.println("Value of a is: "+a+"   Value of b is: "+b);
	}
}

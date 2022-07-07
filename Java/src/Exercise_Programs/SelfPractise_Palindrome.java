package Exercise_Programs;

public class SelfPractise_Palindrome 
{
	public static void main(String[] args) 
	{
		SelfPractise_Palindrome spp = new SelfPractise_Palindrome();
		spp.Palindrom1();
	}
	
	public void Palindrom1()
	{
		int a=32123;
		int b=a;int temp=a;
		int c=0;
		for(int i=1;a>0;i++)
		{
			a=a%10;
			b=b/10;
			c=c*10+a;
			a=b;
			System.out.println("Value of C is;"+c);
		}
		
		if(temp==c)
			System.out.println("The Entered number is Palindrome:");
		else
			System.out.println("The Entered number is NOT Palindrome:");
	}
	
	public void Palindrom2()
	{
		int a=45114; int a1;
		Integer b=a;
		StringBuffer c = new StringBuffer(b.toString());
		c=c.reverse();
		String c1 = c.toString();
		a1=Integer.parseInt(c1);
		if(a==a1)
			System.out.println("The Entered Number is Palindrome:");
		else
			System.out.println("The Entered Number is NOT a Palindrome:");
	}
}

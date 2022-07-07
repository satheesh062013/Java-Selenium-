package Exercise_Programs;

public class SelfPractise_Find_Array_Duplicate 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,1,6,7,4,9,1};
		int temp=0;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println("Duplicate Value is: "+a[i]);
				}
			}
		}
	}
}

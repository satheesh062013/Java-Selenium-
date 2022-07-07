package Exercise_Programs;

public class SelfPractise_Reverse_A_Word 
{
	public static void main(String[] args) 
	{
		String word = "Hi Satheesh kumar How are You?";
		String[] split = word.split(" ");
		System.out.println("No. of Words after Split: "+split.length);
		
		// Splitted Words
		for(int i=0;i<split.length;i++)
			System.out.println(split[i]);
		System.out.println("********************");
		
		// Reverse Print of Splitted Words
		for(int i=split.length-1;i>=0;i--)
			System.out.println(split[i]);
		System.out.println("********************");
	}
}

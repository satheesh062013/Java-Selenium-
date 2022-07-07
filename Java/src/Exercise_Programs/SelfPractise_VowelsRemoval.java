package Exercise_Programs;

public class SelfPractise_VowelsRemoval 
{
	public static void main(String[] args) 
	{
		String word = "SaiKutty";
		// Method:1
		String replaceAll = word.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "*");
		System.out.println(replaceAll);
		System.out.println("************************************");
		
		// Method:2
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		char charReplacement='*';
		int count =0;   //Just to Check
		for (int i = 0; i < word.length(); i++) 
		{
			for (int j = 0; j < vowels.length; j++) 
			{
				if(word.charAt(i)==vowels[j])
				{
					word = word.replace(word.charAt(i), charReplacement);		
					count++;
				}
			}
		}
		System.out.println(word);
		System.out.println(count);		
	}
}

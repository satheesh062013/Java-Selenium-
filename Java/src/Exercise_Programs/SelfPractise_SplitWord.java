package Exercise_Programs;

public class SelfPractise_SplitWord 
{
	public static void main(String[] args) 
	{
		String word = "I am learning Java Course";
		String split[] = word.split(" ");
		System.out.println("Length of Splitted String []:  "+split.length);
		for (String string : split) {
			System.out.println(string+"    "+string.length());
		}
	}
}

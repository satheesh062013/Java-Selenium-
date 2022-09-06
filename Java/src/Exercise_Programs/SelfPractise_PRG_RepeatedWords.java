package Exercise_Programs;

public class SelfPractise_PRG_RepeatedWords{

	public static void main(String[] args) 
	{
		String a = "Java is a Sweet language java sweet";
		String[] split = a.split(" ");
		String temp="";
		for (String string : split) {
			System.out.println(string);
		}
		
		for(int i=0;i<split.length;i++)
		{
			temp = split[i];
			for(int j=i+1;j<split.length;j++)
			{
				if(temp.equalsIgnoreCase(split[j]))
				{
					System.out.println("Repeated word is: "+temp);
				}
			}
		}
	}
}

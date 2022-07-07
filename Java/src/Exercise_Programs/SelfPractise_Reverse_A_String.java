package Exercise_Programs;

public class SelfPractise_Reverse_A_String {

	public static void main(String[] args) 
	{
		String name="Satheeshkumar"; 
		char ch[]=new char[name.length()]; char ch1[]=new char[name.length()];
		int j=name.length()-1;
		System.out.println("Before Reverse the String: "+name);
		for(int i=0;i<name.length();i++)
		{
			ch[i]=name.charAt(j);
			j--;
		}
		System.out.print("After Reverse the String in Char[]: ");
		System.out.print(ch);
		
		String Revname = String.valueOf(ch);
		
		System.out.println("\n\n**********************************");
		System.out.println("Reversed String: "+Revname);
		System.out.println("**********************************");
	}

}

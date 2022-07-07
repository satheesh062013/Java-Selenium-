package Exercise_Programs;

public class SelfPractise_Anagram {

	public static void main(String[] args) 
	{
		int a_Count = 0,b_Count=0,check_Count=0; char temp;
		char alphabets[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
		         'o','p','q','r','s','t','u','v','w','x','y','z'};
		
		String a1 ="satheeshkumarsaipranavkarthikasaikutty"; String b1 ="karthikaSaikuttySatheeshkumarSaipranav";	String a=a1;    String b=b1;
		a1=a1.toLowerCase();a1=a1.replaceAll(" ", "");
		b1=b1.toLowerCase();b1=b1.replaceAll(" ", "");
		
		if(a1.length()==b1.length())
			for(int i=0;i<26;i++)
			{
				temp=alphabets[i];
				for(int j=0;j<a1.length();j++)
				{
					if(temp==a1.charAt(j))
						a_Count++;
					if(temp==b1.charAt(j))
						b_Count++;
				}
				if(a_Count==b_Count)
					check_Count++;
				else
					break;
				a_Count=0;b_Count=0;
			
			}
		if(check_Count==26)
			System.out.println("The Entered Strings are Anagram: "+"a:  "+a+"   b:  "+b);
		else
			System.out.println("The Entered Strings are NOT Anagram");
	}

}

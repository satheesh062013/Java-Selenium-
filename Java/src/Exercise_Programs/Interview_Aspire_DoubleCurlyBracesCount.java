package Exercise_Programs;

public class Interview_Aspire_DoubleCurlyBracesCount {

	public static void main(String[] args)  
			{
				String[] s = {"{}","{","{","{}","{","{","{","{5}","{}"};
				int count=0;
				
				for(int i=0;i<s.length;i++)
				{
					if(s[i].equals("{}")||s[i].equals("{5}"))
					{
						count++;
					}
				}
			System.out.println("No. of Double Curly Braces: "+count);
			}

		}
	



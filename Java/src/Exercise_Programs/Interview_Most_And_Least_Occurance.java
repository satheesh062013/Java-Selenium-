package Exercise_Programs;

import java.util.Arrays;

public class Interview_Most_And_Least_Occurance 
{
	public static void main(String[] args) 
	{
		char alphabets[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
		         'o','p','q','r','s','t','u','v','w','x','y','z'};
		int count[]= new int[alphabets.length];
		int count1[]= new int[alphabets.length];
		int count2=0;
		String word ="welcometojava";
		word.toLowerCase();
		word.replaceAll(" ", "");
		char chWord[] = word.toCharArray();
		for(int i=0;i<alphabets.length;i++)
		{
			for(int j=0;j<word.length();j++)
			{
				if(alphabets[i]==chWord[j])
					count[i]++;
					count1[i]=count[i];
			}
		}
		Arrays.sort(count1);
		
	    for(int k=0;k<alphabets.length;k++)
	    {
	    	if(count[k]==count1[alphabets.length-1])
	    	{
	    		System.out.println("Most Occured Characters: "+alphabets[k]);
	    	}
	    		if((count1[k]>0)&&count2==0)
	    		{
	    			for(int l=0;l<alphabets.length;l++)
	    			{
	    				if(count[l]==count1[k])
	    				{
	    					System.out.println("Least Occured Characters: "+alphabets[l]);
	    					count2++;
	    				}
	    			}
	    		}
	    }
	 		
	}

}

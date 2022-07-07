package com.Test;

public class CurlyBraceCount_Prgm {

	public static void main(String[] args) 
	{
		String[] s = {"{}","{","{","{}","{","{","{","{5}","{}"};
		int count=0;
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals("{}"))
			{
				count++;
			}
		}
	System.out.println("No. of Double Curly Braces: "+count);
	}

}

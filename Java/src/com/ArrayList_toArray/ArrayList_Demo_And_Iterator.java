package com.ArrayList_toArray;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo_And_Iterator {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Satheesh");
		al.add('A');
		al.add("Saipranav");
	
		System.out.println(al);
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			if(it.next().equals('A'))
			{
				al.set(1, "Saikutty");
			}
			//System.out.println(it.next());
			
		}
	System.out.println(al);
	
	String []s = new String[al.size()];
	s=(String[]) al.toArray(s);
	
	for(int i=0;i<s.length;i++)
	{
		System.out.println("\n"+s[i]);
	}
		
		
	}

}

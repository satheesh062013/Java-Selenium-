package com.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class RemovingDuplicatesAndAscendingOrderOfObjects 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList();
		al.add(100);
		al.add(1000);
		al.add(-100);
		al.add(500);
		al.add(2000);
		al.add(100);
		System.out.println("ArrayList Direct Print: "+al);
		Iterator it = al.iterator();
		System.out.println("ArrayList Print by Iterator: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		TreeSet ts = new TreeSet(al);
		System.out.println("Values in Ascending Order after Duplicates Removal: "+ts);
		
	}

}

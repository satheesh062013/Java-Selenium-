package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(true);
		hs.add('A');
		hs.add("Pranav");
		System.out.println("HashSet Value's are: "+hs);
		System.out.println("-------------------------------------------------------------------");
		LinkedHashSet lhs = new LinkedHashSet(hs);
		lhs.add(20);
		lhs.add(false);
		lhs.add('B');
		lhs.add("Sai");
		System.out.println("LinkedHashSet Value's are: "+lhs);
		System.out.println("-------------------------------------------------------------------");
		TreeSet ts = new TreeSet();
		ts.add(30);
		ts.add(50);
		ts.add(100);
		ts.add(1000);
		System.out.println("TreeSet Value's are: "+ts);
	}
}

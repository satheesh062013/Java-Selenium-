package com.Collections;

import java.util.HashSet;
public class HashSet_Demo 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet<>();
		hs.add(null);
		hs.add(null);
		hs.add(5);
		hs.add("Satheesh");
		hs.add('A');
		hs.add(false);
		System.out.println(hs);
		System.out.println("Contains Function(null): "+hs.contains(null));
		System.out.println("Equals Function: "+hs.equals(hs));
		System.out.println("Remove Function(100): "+hs.remove(100));
		System.out.println("Size Function: "+hs.size());
		hs.clear();
		System.out.println("After Empty Function: "+hs.isEmpty());
	}
}

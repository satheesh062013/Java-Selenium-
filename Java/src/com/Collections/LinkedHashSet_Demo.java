package com.Collections;
import java.util.LinkedHashSet;
public class LinkedHashSet_Demo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add(null);
		lhs.add(null);
		lhs.add(5);
		lhs.add("Satheesh");
		lhs.add('A');
		lhs.add(false);
		System.out.println(lhs);
		System.out.println("Contains Function(null): "+lhs.contains(null));
		System.out.println("Equals Function: "+lhs.equals(lhs));
		System.out.println("Remove Function(100): "+lhs.remove(100));
		System.out.println("Size Function: "+lhs.size());
		lhs.clear();
		System.out.println("After Empty Function: "+lhs.isEmpty());
	}
}

package com.Collections;
import java.util.TreeSet;

public class TreeSet_Demo 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet<>();
		ts.add(5);
		ts.add(-5);
		ts.add(500);
		ts.add(-1000);
		ts.add(10000);
		ts.add(150);
		System.out.println(ts);
		System.out.println("Contains Function(null): "+ts.contains(5000));
		System.out.println("Equals Function: "+ts.equals(ts));
		System.out.println("Remove Function(100): "+ts.remove(150));
		System.out.println("Size Function: "+ts.size());
		ts.clear();
		System.out.println("After Empty Function: "+ts.isEmpty());
	}
}

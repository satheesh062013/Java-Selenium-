package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo 
{
	public static void main(String[] args) 
	{
		List<Object> al = new ArrayList<>();
		al.add(10); al.add(true);al.add('A');al.add("Satheesh");
		al.add(500.0);al.add(1, false); al.add("Satheesh");
		System.out.println("ArrayList Objects:        "+al);
		System.out.println("Contains 500.0:           "+al.contains(500.0));
		System.out.println("get Value in Index of 0:  "+al.get(0));
		System.out.println("indexOf Satheesh:         "+al.indexOf("Satheesh"));
		System.out.println("lastIndexOf Satheesh:     "+al.lastIndexOf("Satheesh"));
		System.out.println("ArrayList Objects:        "+al);
		System.out.println("---------------------------------------------------------------------");
		List<Object> al1 = new ArrayList<>();
		al1 = al.subList(0, 4);
		System.out.println("SubArrayList Objects:       "+al1);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ArrayList Objects:             "+al);
		al.addAll(al1);
		System.out.println("After Adding SubList in AL:    "+al);
		al.set(0, 100000);
		System.out.println("After Set 0 Index:             "+al);
		al.remove(1);
		System.out.println("After Remove Index 1:          "+al);
		al.remove("Satheesh");
		System.out.println("After Remove Satheesh:         "+al);
		al.clear();
		System.out.println("After ArrayList Clear:         "+al);
		System.out.println("Is ArrayList is Empty:         "+al.isEmpty());
	}
}

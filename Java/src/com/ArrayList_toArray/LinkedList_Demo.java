package com.ArrayList_toArray;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedList_Demo {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(6);
		ll.add("Karthika");
		ll.add(1000);
		ll.add(100.50);
		ll.add('S');
		System.out.println(ll);
		ll.pop();
		ll.offer(2000);
		System.out.println(ll);
		//ll.offerFirst(2000);
		//ll.pollFirst();
		ll.poll();
		ll.add(1, "Amma");
		System.out.println(ll);
		ListIterator l1 = ll.listIterator();
		
		while(l1.hasNext())
			
			System.out.println(l1.next());
		while(l1.hasPrevious())
			System.out.println(l1.previous());
		
		Spliterator sp = ll.spliterator();
		int a = sp.characteristics();
		System.out.println(a);
	}
}

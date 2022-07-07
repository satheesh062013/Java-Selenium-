package com.Collections;
import java.util.LinkedList;
import java.util.List;
public class LinkedList_Demo 
{
	public static void main(String[] args) 
	{
		List<Object> ll = new LinkedList<>();
		ll.add(50);ll.add(false);ll.add('B');ll.add("Kumar");
		ll.add(-500.0);ll.add(1, true);ll.add("Sai");
		System.out.println("LinkedList Objects:       "+ll);
		System.out.println("Contains -500.0:          "+ll.contains(500.0));
		System.out.println("get Vllue in Index of 0:  "+ll.get(0));
		System.out.println("indexOf Kumar:         "+ll.indexOf("Satheesh"));
		System.out.println("lastIndexOf Satheesh:     "+ll.lastIndexOf("Kumar"));
		System.out.println("LinkedList Objects:       "+ll);
		System.out.println("---------------------------------------------------------------------");
		List<Object> ll1 = new LinkedList<>();
		ll1 = ll.subList(0, 4);
		System.out.println("SubLinkedList Objects:       "+ll1);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("LinkedList Objects:            "+ll);
		ll.addAll(ll1);
		System.out.println("After Adding SubList in ll:    "+ll);
		ll.set(0, -5);
		System.out.println("After Set 0 Index:             "+ll);
		ll.remove(1);
		System.out.println("After Remove Index 1:          "+ll);
		ll.remove("Satheesh");
		System.out.println("After Remove Satheesh:         "+ll);
		ll.clear();
		System.out.println("After LinkedList Clear:        "+ll);
		System.out.println("Is LinkedList is Empty:        "+ll.isEmpty());
	}
}

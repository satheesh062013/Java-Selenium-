package com.Collections;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class HashMap_Demo
{
	public static void main(String[] args) 
	{
		Map<Integer,String> mp = new HashMap<>();
		Map<Integer,String> mp1 = new HashMap<>();
		HashMap_Demo hmd = new HashMap_Demo();
		mp.put(5, "Naina");
		mp.put(1, "Satheesh");
		mp.put(1, "Satheeshkumar");
		mp.put(3, "Karthika");
		mp.put(4, "Amma");
		mp.put(2, "Saikutty");
		mp.put(null,null);
		mp.put(null,"Satheesh");
		mp.put(5, null);
		mp.replace(1, "Satheeshkumar", "101");
		System.out.println("Map Key & Value is: "+mp);
		
		mp1.put(51, "Na");
		mp1.put(11, "Sat");
		mp1.put(11, "Sathees");
		mp1.put(31, "Karth");
		mp1.put(41, "Amm");
		mp1.put(21, "kutty");
		mp1.put(null,null);
		mp1.put(null,"Sathe");
		mp1.put(51, null);
		
		
		System.out.println("Map Key & Value is: "+mp1);
		System.out.println("Contains Function: "+mp.containsKey(10));
		System.out.println("Contains Function: "+mp.containsValue(null));
		System.out.println("entrySet() :"+mp.entrySet());
		System.out.println(mp.equals(mp));
		Set s = mp.keySet();
		System.out.println(s);
		Integer i[] = new Integer[s.size()];
		i=(Integer[]) s.toArray(i);
		for(Integer i1:i)
			System.out.println(i1);
	  	mp.putAll(mp1);
		System.out.println("After Map Key & Value is: "+mp);
		
		System.out.println(hmd.toString());
		Collection<String> values = mp.values();
		System.out.println(values);		
	}
//	public String toString()
//	{
//		return "Saikutty";
//	}
}

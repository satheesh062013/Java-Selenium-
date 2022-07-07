package com.Collections;
import java.util.HashMap;
import java.util.Map;
public class MapConcept 
{
	public static void main(String[] args) 
	{
	Map<Integer,String> m = new HashMap<Integer,String>();
	m.put(1, "Java");
	m.put(2, "C");
	m.put(4, "python");
	m.put(9,"C#");
	m.put(5, ".Net");
	m.put(null, "HTML");
	m.put(null, "Perl");
	m.put(7, null);
	m.put(8, null);
	m.put(null, null);
	System.out.println(m);
	int size = m.size();
	System.out.println("Size of Map: "+size);
	String string = m.get(9);
	System.out.println(string);
	m.get(4);
	}
}

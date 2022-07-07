package com.String;

import java.util.Scanner;

public class StringBuffer_And_StringBuilder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Satheesh");
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());
		System.out.println("StringBuilder Before Append Function: "+sb);
		System.out.println("StringBuilder After Append Function: "+sb.append("Kumar"));
		System.out.println(sb.codePoints());
		System.out.println(sb.indexOf("theesh"));
		System.out.println(sb.lastIndexOf("Kumar"));
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4, 8));
		System.out.println(sb.delete(4, 8));
		System.out.println(sb.insert(0, "Sekar"));
		System.out.println(sb.replace(0, 5, "Sai "));
		System.out.println(sb.subSequence(0, 9));
		System.out.println(sb.reverse());
		sb.setCharAt(0, 'Z');
		System.out.println(sb);
		sb.setLength(8);
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());
	}
}

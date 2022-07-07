package com.GUI;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class JOptionPane_Demo 
{
	public static void main(String[] args) 
	{
		int a=3;
		Integer a1=a;
		String aa="123";
		Integer a2=Integer.parseInt(aa);
		//Float a2=Float.parseFloat(aa);
		String aaa =a1.toString();
		String aaa1=aaa+1000;
		Integer q=Integer.parseInt(aaa1);
		System.out.println(q+1);
		Character ch='A';
		String aaaa=ch.toString();
		System.out.println(aaaa+a);
	}
}

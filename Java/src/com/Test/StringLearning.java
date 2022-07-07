package com.Test;

public class StringLearning {

	public static void main(String[] args) 
	{
		StringLearning sl = new StringLearning();
		System.out.println("The Output of OBJECT StringLearning is: "+sl);
		System.out.println("\nObjectName sl's hashcode value in Decimal is: "+sl.hashCode());
		System.out.println(sl.toString());
		StringLearning sl1= new StringLearning();
		sl1=sl;
		System.out.println("\nThe Output of OBJECT sl2 BEFORE=null is: "+sl1);
		sl1=null;
		if(sl1==sl)
		   System.out.println("\nYes Objects sl1 & sl are Equal");
		else
			System.out.println("\nNo Objects sl1 & sl are Not Equal");
		
		System.out.println("\nThe Output of OBJECT sl1 AFTER=null is: "+sl1);
		String s="\nSatheeshkumar ";
		String s1 = "Karthika ";
		String s2 ="Saipranav ";
		System.out.println("\nString Concatenation output is: "+s.concat(s1).concat(s2));
		
	}

}

package com.Inheritance;

public class SocialMedia_Child extends SocialMedia_Parent {
	
	int whats_count=567;
	
	public void whatsApp()
	{
		System.out.println("SocialMedia_Child Class---> WhatsApp");
	}

	public  static void main(String[] args) {
		
		
		SocialMedia_Parent.message("Before Object Creation: Static method call by Class Name from SocialMedia_Parent--->: " );
		
		SocialMedia_Child smp = new SocialMedia_Child();// NON Static Block Called while Object Creation

		smp.message("After Object Creation: Static method call by Object from SocialMedia_Parent--->: " ); //WARNING: Static method must be called by ClassName instead of Object
		
		System.out.println(" "+SocialMedia_Parent.age + " "+smp.pi+ " "+ smp.salary+" "+smp.max_short+" "+smp.min_short);
		
	}

}

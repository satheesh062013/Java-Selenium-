package com.Exception;

public class SaikuttyException extends Throwable
{
	public static void main(String[] args) throws Throwable 
	{
		int a=9;
		if(a<10)
		{
			SaikuttyException ude = new SaikuttyException();
			throw ude;
		}
	}
}

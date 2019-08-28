package com.nonstatic;

public class Ns2 {

	
		{
			System.out.println("from instance initializer block");
			
		}
	public static void main(String[] args)
	{
		System.out.println("from main");
		Ns2 n1=new Ns2();
		System.out.println("main ends");
		
		}
	{
		System.out.println("from 2nd instance initializer block");
	}

}


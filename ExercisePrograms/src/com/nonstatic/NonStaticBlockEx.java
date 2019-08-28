package com.nonstatic;

public class NonStaticBlockEx {
	{                //Non static block(instance initializer block)
		System.out.println("this is a non static block");
	}
	public static void main(String[] args) {
		NonStaticBlockEx n1=new NonStaticBlockEx();
		System.out.println(new NonStaticBlockEx());
	}
		
	}
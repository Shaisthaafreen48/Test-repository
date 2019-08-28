package com.constructor;

public class ConstructorChaining {
	ConstructorChaining()
	{
		System.out.println("from ConstructorChaining()");
	}
	ConstructorChaining(int i)
	{
		this();
		System.out.println("ConstructorChaining(int)");
	}
	public static void main(String[] args) {
		ConstructorChaining c=new ConstructorChaining(); //from ConstructorChaining()
		ConstructorChaining c2= new ConstructorChaining(10); //from ConstructorChaining(int)
	}
	

}

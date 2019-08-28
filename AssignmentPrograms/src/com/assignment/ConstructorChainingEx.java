package com.assignment;

public class ConstructorChainingEx {
	ConstructorChainingEx()
	{
		System.out.println("Hurray!!!! I will be executed each time");
	}
	ConstructorChainingEx(int i)
	{
		this();
		System.out.println("hello!!!I am the second constructor");
		System.out.println("*****************************************");
	}
	ConstructorChainingEx(double d)
	{
		this();
		System.out.println("hello!!!I am third constructor");
		System.out.println("*****************************************");
	}

	public static void main(String[] args) {
		ConstructorChainingEx c1=new ConstructorChainingEx(10);
		ConstructorChainingEx c2=new ConstructorChainingEx(10.00);
	}

}

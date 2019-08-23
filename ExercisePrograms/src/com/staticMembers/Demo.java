package com.staticMembers;

public class Demo {
	static int i;
	static
	{
		System.out.println(i);
		i=20;
	}
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

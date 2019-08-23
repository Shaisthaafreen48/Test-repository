//sample program for static initialiser block
package com.staticMembers;

public class SIB {
	static
	{
		System.out.println("static initialiser block-2");
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
	}
	static
	{
		System.out.println("static initialiser block-1");
	}

}

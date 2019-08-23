package com.staticMembers;

public class AccessDemo {
	static int i=70;
	public static void main(String[] args)
	{
		int i=30;
		System.out.println(i);
		System.out.println(AccessDemo.i);
		System.out.println(CallingVariable.i);
	}

}

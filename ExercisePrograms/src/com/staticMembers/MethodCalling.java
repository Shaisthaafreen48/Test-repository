package com.staticMembers;

public class MethodCalling {
	static void test()
	{
		System.out.println("from test method");
	}
	public static void main(String[] args)
	{
		System.out.println("main begins");
		test(); //calling directly
		System.out.println("----------------");
		MethodCalling.test();
		System.out.println();
	}

}

package com.nonstatic;

public class NonStaticMethod {
	void test()
	{
		System.out.println("from test()");
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		NonStaticMethod n1= new NonStaticMethod ();
		n1.test();
		System.out.println("main ends");
	}

}

package com.nonstatic;

public class NonStaticBlock2 {
	int i=10;
	{
		System.out.println(i);
		this.i=20;
	}
	NonStaticBlock2()
	{
		System.out.println("from NonStaticBlock2()");
	}
	
}

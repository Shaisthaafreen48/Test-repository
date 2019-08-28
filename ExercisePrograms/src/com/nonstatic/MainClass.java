package com.nonstatic;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("from main");
		NonStaticBlock2 ob=new NonStaticBlock2();
		System.out.println(ob.i);
		System.out.println("main ends");

	}

}

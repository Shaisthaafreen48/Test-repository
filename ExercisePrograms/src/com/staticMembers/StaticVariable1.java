package com.staticMembers;

public class StaticVariable1 {
		static int a=10; //class static variable
	public static void main(String[] args) {
		int a=20;//local variable
		System.out.println(a);//referring to local variable
		System.out.println(StaticVariable1.a);
	
	
	}

}

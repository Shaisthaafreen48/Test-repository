//program to call variable directly and also by using class name
package com.staticMembers;

public class CallingVariable {
	static int i=10;
	public static void main(String[] args)
	{
		System.out.println(i);//calling directly
		System.out.println(CallingVariable.i);//using class name
	}

}

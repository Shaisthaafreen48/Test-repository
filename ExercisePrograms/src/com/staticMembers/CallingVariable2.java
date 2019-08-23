//program to call variable directly and also by using class name
package com.staticMembers;

public class CallingVariable2 {
	static int i=10;
	public static void main(String[] args)
	{
		System.out.println(i);//calling directly
		System.out.println(CallingVariable2.i);//using class name
		CallingVariable2.i=30;
		System.out.println(CallingVariable2.i);
	}

}

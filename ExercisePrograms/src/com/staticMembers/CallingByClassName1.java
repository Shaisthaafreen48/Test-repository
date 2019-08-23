package com.staticMembers;

public class CallingByClassName1 {
	public static void main(String[] args)
	{
		System.out.println(CallingVariable2.i);//calling variable from another class
	}

}
// 10 gets executed because class S4 gets loaded and after that initialisers gets executed but
//we are not executing S4 class so the reassignment part wont get executed 
//WAP to count the number objects of a class
package com.nonstatic;

public class CountObjects {
	static int count; //since count should be updated it should have single copy so we made it as static
	{
		count++; //or count=count+1;
	}
	public static void main(String[] args) {
		CountObjects a=new CountObjects();
		CountObjects b=new CountObjects();
		CountObjects c=new CountObjects();
		CountObjects d=new CountObjects();
		CountObjects e=new CountObjects();
		System.out.println(count);
	}
}

package com.constructor;

public class ConstructorChaining2{
	ConstructorChaining2()
	{
		this(10);
		System.out.println("from ConstructorChaining2()");
	}
	ConstructorChaining2(int i)
	{
		//this(); "CTE" since it is calling 1st constructor and the 1st one is calling 2nd constructor
		//it becomes infinite or recursive.
		System.out.println("ConstructorChaining2(int)");
	}
	public static void main(String[] args) {
		ConstructorChaining2 c1=new ConstructorChaining2(); //from ConstructorChaining()
		ConstructorChaining2 c2= new ConstructorChaining2(10); //from ConstructorChaining(int)
	}
	

}

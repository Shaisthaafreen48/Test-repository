package com.nonstatic;

public class ThisKeywordEx {
	int i;
	void test()  //called method
	{
		System.out.println("from test");
		System.out.println(i); //10
		System.out.println("this:" +this); //address of object ob
		i=20;  //reinitialization
		System.out.println(this.i); //displaying i
		System.out.println("end of test");
	}
	public static void main(String[] args) //calling method
	{
		System.out.println("from main");
		ThisKeywordEx ob=new ThisKeywordEx();
		ob.i=10; //initialization 
		ob.test(); //calling test method
		// System.out.println(this); CTE
		System.out.println("ob: "+ob); //address of object ob
		System.out.println("end main");
		
	}

}

//WAP to create a class known as Vanheusan Shirts(String color,int size, String product code) the product code for the first shirt is 
//van1. create two constructors one is parameterized and another is non parameterized
package com.nonstatic;

public class VanheusanShirts {
	String color;
	int size;
	static int productCount;
	String productCode;
	{
		productCount++;
		productCode="VAN"+productCount;
	}
	VanheusanShirts()
	{
		System.out.println("Vanheusan shirts");
	}
	VanheusanShirts(String color,int size)
	{
		this.color=color;
		this.size=size;
	}
	public static void main(String[] args) {
		VanheusanShirts v1=new VanheusanShirts();
		VanheusanShirts v2=new VanheusanShirts("red",32);
		VanheusanShirts v3=new VanheusanShirts("Blue",34);
		System.out.println("color of the shirt is "+v2.color+" size of the shirt is "+v2.size+" the product code is "+v2.productCode);
		System.out.println("color of the shirt is "+v3.color+" size of the shirt is "+v3.size+" the product code is "+v3.productCode);
	}
	

}

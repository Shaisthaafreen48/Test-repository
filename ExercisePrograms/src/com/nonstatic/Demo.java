/* write a program to design a class representing an entity known as marker having the following 
 * properties i.e., color, name, length, price. design a method known as initialize to assign the values
 */
package com.nonstatic;

public class Demo {
	String color;
	String name;
	double length;
	int price;
	void initialize(String color,String name, double length,int price) //names can be same here so that
																	   //its easy to remember
	{
		this.color=color;
		this.name=name;
		this.length=length;
		this.price=price;
		
	}
	public static void main(String[] args) {
		Marker d1=new Marker();
		d1.initialize("red","camlin",7.6,30);
		System.out.println("color of the marker is: "+d1.color+"\nname of the marker is: "+d1.name+ "\nlength of the marker is:"+d1.length+"\nprice is: "+d1.price);
	}

}

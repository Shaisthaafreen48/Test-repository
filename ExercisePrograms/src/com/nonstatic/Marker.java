/* write a program to design a class representing an entity known as marker having the following 
 * properties i.e., color, name, length, price. design a method known as initialize to assign the values
 */
package com.nonstatic;

public class Marker {
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
		System.out.println("color of the marker is: "+this.color+"\nname of the marker is: "+this.name+ "\nlength of the marker is:"+this.length+"\nprice is: "+this.price);
		
	}
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.initialize("red","camlin",7.6,30);
		Marker m2=new Marker();
		m2.initialize("black","cello",8.0,32);
		
	}

}

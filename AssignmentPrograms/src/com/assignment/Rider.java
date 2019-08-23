package com.assignment;

public class Rider {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		v1.name="Pulsar";
		v1.color="Red";
		v1.speed=120.50;
		v2.name="KTM";
		v2.color="black and orange";
		v2.speed=200.80;
		System.out.println("vehicle name is: "+v1.name+"\nthe color of the vehicle is: "+v1.color+"\nSpeed of the vehicle is: "+v1.speed+" KMPH");
		System.out.println("---------------------------------------------");
		System.out.println("vehicle name is: "+v2.name+"\nthe color of the vehicle is: "+v2.color+"\nSpeed of the vehicle is: "+v2.speed+" KMPH");
		
		
		

	}

}

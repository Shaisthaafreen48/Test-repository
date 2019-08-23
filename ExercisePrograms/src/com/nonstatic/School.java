package com.nonstatic;

public class School {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		System.out.println("student name is "+s1.name+", student marks is "+s1.marks);
		System.out.println("student name is "+s2.name+", student marks is "+s2.marks);
		s1.name="chiku";
		s1.marks=90;
		System.out.println("student name is "+s1.name+", student id is "+s1.marks);
		s2.name="chikki";
		s2.marks=98;
		System.out.println("student name is "+s2.name+", student id is "+s2.marks);
		

	}

}
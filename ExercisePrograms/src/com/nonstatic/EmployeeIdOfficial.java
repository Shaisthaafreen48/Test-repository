package com.nonstatic;

public class EmployeeIdOfficial {
	static int countEmployee;
	String id;
	String name;
	{
		countEmployee++;
		id="TY"+countEmployee;
	}
	EmployeeIdOfficial()
	{
		System.out.println("from employee()");
	}
	EmployeeIdOfficial(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		EmployeeIdOfficial e1=new EmployeeIdOfficial();
		EmployeeIdOfficial e2=new EmployeeIdOfficial("sara");
		System.out.println(e1.name+" has the id as "+e1.id);
		System.out.println(e2.name+" has the id as "+e2.id);
		System.out.println("number of employees are "+countEmployee);
		
	}

}

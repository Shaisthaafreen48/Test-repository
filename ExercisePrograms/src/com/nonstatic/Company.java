package com.nonstatic;

public class Company {

	public static void main(String[] args) {
			Employee e1=new Employee();
			System.out.println(e1.name+" is the employee name "+e1.id+" is the id");
			Employee e2=new Employee();
			System.out.println(e2.name+" is the employee name "+e2.id+" is the id");
			e2.name="chiku";
			e2.id=1;
			System.out.println(e2.name+" is the employee name"+e2.id+" is the id");
			Employee e3=new Employee();
			e3.name="kuku";
			e3.id=2;
			System.out.println(e3.name+" is the employee name"+e3.id+" is the id");
			

	}

}

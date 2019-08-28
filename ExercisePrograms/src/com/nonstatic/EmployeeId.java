package com.nonstatic;

public class EmployeeId{


		String id;
		static int count;
		{
			count++;
			id="TY"+count;
		
		}
		public static void main(String[] args)
		{
			EmployeeId e1=new EmployeeId();
			EmployeeId e2= new EmployeeId();
			EmployeeId e3=new EmployeeId();
			EmployeeId e4=new EmployeeId();
			System.out.println("the id of employee is "+e1.id );
			System.out.println("the id of employee is "+e2.id );
			System.out.println("the id of employee is "+e3.id );
			System.out.println("the id of employee is "+e4.id );
			System.out.println("the number of employees are "+count);
			
			
		}

	}



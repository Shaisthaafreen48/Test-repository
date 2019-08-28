package com.nonstatic;
class ObjectCreationEx
       {
	     int i ;  //non static variable
	     public static void main(String[] args)
	     {
		ObjectCreationEx ob=new ObjectCreationEx();
		System.out.println(ob.i);
		System.out.println(ob);
		System.out.println(new ObjectCreationEx());
	      }
           }

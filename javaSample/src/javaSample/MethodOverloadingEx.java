package javaSample;
//Sample program to design a method to perform multiplication of 2 integers, 2 decimal numbers and 3 integers
public class MethodOverloadingEx {
	public static int product(int x,int y)
	{
		int a=x*y;
		System.out.println(a);
		return a;
	}
	public static double product(double x,double y)
	{
		double b=x*y;
		System.out.println(b);
		return b;
	}
	public static int product(int x,int y,int z)
	{
		int c=x*y*z;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args)
	{
		System.out.println("initiated");
		product(1,2);
		product(1,2,3);
		product(1.5,2.0);
		System.out.println("terminated");
	}
}


public class Exercise {
	static int i;
	int j=45;
	void Ex2()
	{
		System.out.println(i); //accessing static variable directly 
		System.out.println(Exercise.i); //accessing static variable inside non static by using class name
		System.out.println(j);  //accessing non static member directly inside non static context.
		System.out.println(this.j); //accessing non static member using this keyword inside non static context
	}
	public static void main(String[] args) {
	System.out.println(i);   //calling static variable i directly
	System.out.println(Exercise.i);  //calling static variable i using class name
	Exercise e1=new Exercise(); // by creating an object we can access non static member 
	e1.Ex2(); //accessing non static member(method in this case)  inside a static context
	System.out.print("hi");
		
	
		

	}

}

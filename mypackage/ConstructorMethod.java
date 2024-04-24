package mypackage;

public class ConstructorMethod {

	ConstructorMethod () //constructor > same name as class name
	{
		System.out.println("Calling Constructor Method");
	}
	
	
	public static void main(String[] args)
	
	{
		System.out.println("Main method");
		ConstructorMethod c1 = new ConstructorMethod();
		
		
		new ConstructorMethod(); //same o/p as line no. 15

	}

}

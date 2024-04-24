package mypackage;

public class Static_NonStatic_Constructor_InsideMainMethod 
{
	
	
	public static void add()//static
	{
		int a=20;
		int b=10;
		int sum = a+b;
		System.out.println("sum =" + sum);
	}
	
	void Sub()//non static
	{
		
		int a=20;
		int b=10;
		int sub = a-b;
		System.out.println("sub =" + sub);
	}
	
	Static_NonStatic_Constructor_InsideMainMethod() //constructor same as class name
	{
		System.out.println("this is constructor");
	}

	public static void main(String[] args) 
	{
		
				add();
				Static_NonStatic_Constructor_InsideMainMethod s1 = new Static_NonStatic_Constructor_InsideMainMethod();
				s1.Sub();
				

	}
	

}

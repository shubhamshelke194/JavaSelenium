package mypackage;

public class HowToCall_StaticMethod_InsideMainMethod
{ 

	static void add()
	{
		System.out.println("Addition");
	}
	
	public static void main(String[] args) 
	{	
		add();
		System.out.println("Main Method"); 
		
	}

	
}

package mypackage;

public class ConstructorOverloading 
{

	

		ConstructorOverloading(int a, int b)
		{
			System.out.println("1");
		}
		
		ConstructorOverloading(double a)
		{
			System.out.println("2");
		}
		
		ConstructorOverloading()
		{
			System.out.println("3");
		}
		
	public static void main(String[] args) 
	{
			
			new ConstructorOverloading(1,2);
			new ConstructorOverloading(65.45);
			new ConstructorOverloading();
		
	}

}

package mypackage;

public class NonStatic_Inside_MainMethod 
{

	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic_Inside_MainMethod n1=new NonStatic_Inside_MainMethod() ;
		n1.add();
		
	}

}

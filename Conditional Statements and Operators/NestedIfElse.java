package Conditional_StatementsAnd_Operators;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=21;
		double salary=20000;
		
		if(age>18)
		{
			if(salary>50000) 
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		
		else
		{
			System.out.println("3");
		}
		
	}

}

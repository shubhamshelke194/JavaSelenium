package assignments_javaa;

public class Assignment_06_SIB_IIB_MainMethod_Constuctor {

	//Creating one more object for SIB,IIB,CON,MM program
	

	
		
		static
		{
			int a=10;
			int b= 20;
			int sum=a+b;
			System.out.println("addition="+sum);
		}
		{
			double c=10.0;
			double d=44.20;
			double sub=d-c;
			System.out.println("subtraction="+sub);
		}
		Assignment_06_SIB_IIB_MainMethod_Constuctor()
		{
			System.out.println("i'm constructor");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("print main method");
			Assignment_06_SIB_IIB_MainMethod_Constuctor T1=new Assignment_06_SIB_IIB_MainMethod_Constuctor();
			Assignment_06_SIB_IIB_MainMethod_Constuctor T2=new Assignment_06_SIB_IIB_MainMethod_Constuctor();
		}

	
	
}

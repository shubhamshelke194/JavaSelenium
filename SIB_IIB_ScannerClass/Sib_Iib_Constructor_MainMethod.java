package sib_and_iib_class;

public class Sib_Iib_Constructor_MainMethod 
{
	static//sib
	{
		System.out.println("sib");
	}
	{
		System.out.println("Iib");//iin
	}
	{
		System.out.println("Con");//con
	}

	public static void main(String[] args)
{
		System.out.println("MainMethod");
		Sib_Iib_Constructor_MainMethod s1=new Sib_Iib_Constructor_MainMethod();
		Sib_Iib_Constructor_MainMethod s2=new Sib_Iib_Constructor_MainMethod();
		
}

}
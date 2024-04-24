package assignments_javaa;

import java.util.Scanner;

public class Assignment_07_ScannerClass_Methods_Variables {
	
	void add()

	{
		Scanner S1 =new Scanner(System.in);
		System.out.println("enter the first value");
		int a=S1.nextInt();
		System.out.println("enter the Second value");
	     int b=S1.nextInt();
		int Result=a+b;
		System.out.println("result="+Result);
		
		
	}
	void sub()

	{
		
		Scanner S1 =new Scanner(System.in);
		System.out.println("enter the first value");
		int c=S1.nextInt();
		System.out.println("enter the Second value");
		int d=S1.nextInt();
		int Result=c-d;
		System.out.println("result="+Result);
		
		
	}
	void mul()

	{
		Scanner S1 =new Scanner(System.in);
		System.out.println("enter the first value");
		int a=S1.nextInt();
		System.out.println("enter the Second value");
		int b=S1.nextInt();
		int Result=a*b;
		System.out.println("result="+Result);
		
	}
	void div()

	{
		Scanner S1 =new Scanner(System.in);
		System.out.println("enter the first value");
		int a=S1.nextInt();
		System.out.println("enter the Second value");
		int b=S1.nextInt();
		int Result=a/b;
		System.out.println("result="+Result);
		
		}
	void mod()

	{
		Scanner S1 =new Scanner(System.in);
		System.out.println("enter the first value");
		int a=S1.nextInt();
		System.out.println("enter the Second value");
		int b=S1.nextInt();
		int Result=a%b;
		System.out.println("result="+Result);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_07_ScannerClass_Methods_Variables M1= new Assignment_07_ScannerClass_Methods_Variables();
		M1.add();
		M1.sub();
		M1.mul();
		M1.div();
		M1.mod();	
		
	}
}
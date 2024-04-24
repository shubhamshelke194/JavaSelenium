package assignments_javaa;

import java.util.Scanner;

public class Assignment_09_AreaOfCircle {
	final static double pi = 3.14;
	void area()
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the value of radius");
		//int r=S1.nextInt();
	    double r=S1.nextDouble();
		double Area_of_circle=pi*r*r;
		System.out.println("Area_of_circle= "+Area_of_circle);
		S1.close();		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_09_AreaOfCircle A1=new Assignment_09_AreaOfCircle();
		A1.area();
	}

}
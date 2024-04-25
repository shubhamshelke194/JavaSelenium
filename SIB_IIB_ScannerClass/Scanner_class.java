package sib_and_iib_class;

import java.util.Scanner;

public class Scanner_class 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
				int firstno=s1.nextInt();
				int secondno=s1.nextInt();
				int sum= firstno+secondno;
				System.out.println(sum);
				s1.close();
				
	}
	
	
}
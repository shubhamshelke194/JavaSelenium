package assignments_javaa;

import java.util.Arrays;

public class Assignment_21_AlphaDigitsCheck {
	
	public static void main(String[] args) {
		String s="Hello123";
		int Alpha_count=0;
		String b1="good12";
		int digit_count=0;
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++) {
		boolean b = Character.isAlphabetic(c[i]);
		if(b==true) {
			Alpha_count=Alpha_count+1;
		}
		
	}
   System.out.println(Alpha_count);
   // digit count
   char[] c1=b1.toCharArray();
	System.out.println(Arrays.toString(c1));
	for(int i=0;i<c1.length;i++) {
		boolean b12 = Character.isAlphabetic(c1[i]);
		if(b12==true) {
			digit_count=digit_count+1;
		}
		
	}
  System.out.println(digit_count);
}
}
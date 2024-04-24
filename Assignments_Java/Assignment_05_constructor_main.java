package assignments_javaa;

public class Assignment_05_constructor_main 
{
	
	//Create 5 constructor and call it in main method
		
	Assignment_05_constructor_main(int a,int b) //same name of constructor  as class name
		{
		System.out.println("sum ="+(a+b));
		}
		Assignment_05_constructor_main(char ch)
		{
			System.out.println("character = "+ch);
		}
		Assignment_05_constructor_main(String str,String a)
		{
			System.out.println("my name is = "+(str + a));
		}
		Assignment_05_constructor_main(boolean True)
		{
			System.out.println("sky is blue? = "+True);
		}
		Assignment_05_constructor_main(int q,boolean r,char ch,String s)
		{
			System.out.println(q);
			System.out.println(r);
			System.out.println(ch);
			System.out.println(s);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new Assignment_05_constructor_main(5,10);
			new Assignment_05_constructor_main('a');
			new Assignment_05_constructor_main("vaishnavi","kadam");
			new Assignment_05_constructor_main(true);
			new Assignment_05_constructor_main(50,false,'d',"city");
		}

	
	
}

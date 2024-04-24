package assignments_javaa;

public class Assignment_19_Arrays {

	//Create array of size of 4 but store 5th value in it 
	public static void main(String[] args) {
		int numb[]=new int[4];
		numb[0]=13;
		numb[1]=22;
		numb[2]=44;
		numb[3]=55;
		numb[4]=66;
		int sum=0;
		for (int i=0;i<numb.length;i++)
		{
			sum=sum+numb[i];
		}
		System.out.println("addition:"+sum);

	}

}



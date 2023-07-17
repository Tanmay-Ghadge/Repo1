package java_Interview_Questions;

public class EvenOddFromArray {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6,7,8,9};

		for (int i : a) 
		{
			if(i%2==0)
				System.out.println("even-->"+i);
			else
				System.out.println("odd--> "+i);
		}
		
		
		
	}

}

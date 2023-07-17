package java_Interview_Questions;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		int number=5;
		int factorial = 1;
		
		

		for(int j=number;j>1;j--)
		{
			factorial=factorial*j;
		}

		
		System.out.println(factorial);
		
	}

}

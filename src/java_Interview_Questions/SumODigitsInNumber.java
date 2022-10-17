package java_Interview_Questions;

public class SumODigitsInNumber
{

	public static void main(String[] args) 
	{
		int number=12354;

		int sum=0;

		while(number>0)
		{
			sum=sum+ number%10; // when divided by 10 it will give last digit of the number
			number=number/10;   // dividing a number will remove the last digit
		}
		System.out.println("sum of digits is="+sum);
	}

}

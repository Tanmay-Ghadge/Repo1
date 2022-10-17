package java_Interview_Questions;

public class CountNumberOfDigits
{
	public static void main(String[] args) 
	{
		int number=4154616;

		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println(count);
	}

}

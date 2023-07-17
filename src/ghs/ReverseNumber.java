package ghs;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int numberToRverse=645132;
		int number= 0;
		int temp;
// this line is not in my local
		
		while(numberToRverse>0)
		{
			temp=numberToRverse%10;
			System.out.println(temp);
			number=number*10+temp;
			System.out.println(number);
			numberToRverse=numberToRverse/10;
		}
		System.out.println(number);
		
		
		
		
	}

}

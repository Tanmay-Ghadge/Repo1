package java_Interview_Questions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		//A pallindrome number is a number when we reverse that number still it remains the same 
		// eg. 11111,

		// write a code to know whether the element is palindrome or not
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int originalNumber=sc.nextInt();
		int num=originalNumber;
		
		int lastDigit=0;
		int reverse=0;
		
		while(originalNumber!=0)
		{
			lastDigit=originalNumber%10;
			reverse=reverse*10+lastDigit;
			originalNumber=originalNumber/10;
		}
		
		
		if(num==reverse)
		{
			System.out.println(num+"-- is Palondrome");
		
		}
		else
		{
			System.out.println(originalNumber+"-- is not a Palondrome");
		}
			
	

	}

}

package java_Interview_Questions;

import java.util.Scanner;

public class Reverse_A_Number
{

	public static void main(String[] args) 
	{

		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse:");
		int numberToReverse=userInput.nextInt();
		
		// appproch 1-logic
		
		/*
		 * int lastDigit=0; int reverse=0;
		 * 
		 * while(numberToReverse!=0) { lastDigit=numberToReverse%10;
		 * reverse=reverse*10+lastDigit; numberToReverse=numberToReverse/10;
		 * System.out.println("i"); } System.out.println("reverse number:"+reverse);
		 */
		

		//approch 2-StringBuffer
		StringBuffer buffer=new StringBuffer(String.valueOf(numberToReverse));
	    StringBuffer reversedValue=buffer.reverse();
		System.out.println("reversed value:"+reversedValue);
		
		
		//approch 3-
		StringBuilder builder=new StringBuilder(numberToReverse);
		builder.append(numberToReverse);
		StringBuilder reverseBuilder=builder.reverse(); 
		
		System.out.println("reverse value:"+reverseBuilder);
	
	}

}

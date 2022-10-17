package java_Interview_Questions;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str=sc.next();
		String originalString=str;
		
		String reverse="";
	
		int lenghtOfString=str.length();

		for(int i=lenghtOfString-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}

		System.out.println(reverse);
		System.out.println(originalString);
		System.out.println(str);
		if(reverse.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}

}

package java_Interview_Questions;

import java.util.Scanner;

public class WordsInAString
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String scannerString=sc.next();//welcome to java
		int wordCount=0;
		
		for(int i=0;i<scannerString.length()-1;i++)
		{
			char letter=scannerString.charAt(i);
			char letter2=scannerString.charAt(i+1);
			System.out.println(letter);
			System.out.println(letter2);
			
			System.out.println("----");
			if((scannerString.charAt(i)==' ' )&& (scannerString.charAt(i+1)!=' '))
			{
				System.out.println("----");
				wordCount++;
			}
			
		}
		
		
		
		System.out.println("Number of letters in a String are-"+wordCount);
		
		
		
		

	}

}

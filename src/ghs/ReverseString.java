package ghs;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//reverse String
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();

		String reverse="";

		for(int i=name.length()-1;i>=0;i--)
		{
			char letter=name.charAt(i);
			reverse=reverse+letter;
		}
		System.out.println(reverse);

		//reverse Number
		Scanner scanner2=new Scanner(System.in);
		int number=scanner2.nextInt();
		int reverseNumber=0;

		while(number>0)
		{
			int temp=number%10;
			reverseNumber=reverseNumber*10+temp;
			number=number/10; 
		}
		System.out.println(reverseNumber);
	}

}




/*
int number=4466841;
int reverseNumber=0;

while(number>0)
{
	int temp=number%10;
	System.out.println(temp);
	reverseNumber=reverseNumber*10+temp;
	number=number/10;
}
System.out.println(reverseNumber);*/
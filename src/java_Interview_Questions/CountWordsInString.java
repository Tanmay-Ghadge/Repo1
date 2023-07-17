package java_Interview_Questions;

import java.util.Scanner;

public class CountWordsInString
{

	public static void main(String[] args) 
	{
		System.out.println("enter String");
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();

		int count=1;

		for(int i=0;i<words.length();i++)
		{
			if((words.charAt(i)==' ') && (words.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);





	}


}

package locate;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a year");
		String year=sc.next();
		
		if(2000%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not leap year");
		}
		

	}

}

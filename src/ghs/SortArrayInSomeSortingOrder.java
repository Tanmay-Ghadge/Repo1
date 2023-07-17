package ghs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import java_Interview_Questions.CheckingANumberISInArray;

class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) 
	{
		
		if(o2<o1)
		{
			return +1;
		}
		else if(o2>o1)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}

public class SortArrayInSomeSortingOrder  {

	public static void arraySort() 
	{
		int[] unsortedArray= {4,3,2,5,1};	
		Set<Integer> set=new TreeSet<Integer>(new MyComparator());
		List<Integer> list=new ArrayList <Integer>();
		
		for(int unsortedArrayElement:unsortedArray)
		{
			set.add(unsortedArrayElement);
		}
		
		for(int unsortedArrayElement:unsortedArray)
		{
			list.add(unsortedArrayElement);
		}
		
		System.out.println("Treeset orting Descending-"+ set);
		System.out.println(list);
		
	}
	
	public static void checkingANumberIsInArray()
	{
		int[] givenArray= new int[] {10,20,30,40,50,60,70};
		int reqiredNumber=550;
		boolean isElemetPresent = false;
		
		for(int arrayAlement:givenArray)
		{
			if(arrayAlement==reqiredNumber)
			{
				isElemetPresent=true;
			}
		}
		
		if(isElemetPresent==true)
		{
			System.out.println("Required element ="+reqiredNumber+" is present in the Given array");
		}
		else
		{
			System.out.println("Required element ="+reqiredNumber+" is NOT present in the Given array");
		}
		
		
		
		
	}
	
	public static void findnumberofevenOdds()
	{
		int num=22222212;
		int evenNumber=0;
		int oddNumber=0;

		while(num>0)
		{
			if(num%2==0)
				evenNumber++;	
			else
				oddNumber++;	
			num=num/10;
		}
		System.out.println("even Number="+ evenNumber);
		System.out.println("odd Number="+ oddNumber);

	}
	
	
	public static void countNumberOfDigitsInNumber()
	{
		int number=415;
		int count=0;
		
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println("Number of digits in the given number="+count); 
	}
	
	
	//*******************
	public static void lettersInAString()
	{
		System.out.println("enter String");
		Scanner scanner=new Scanner(System.in);
		String scannerString=scanner.nextLine(); 
		int count=0;
		
		System.out.println(scannerString.length());
		for(int i=0;scannerString.length()>=0;i++)
		{
			scannerString.charAt(i);
			count++;
		}
		System.out.println(count);
	}
	
	public static void wordsInAString()
 	{
      String sentence="dtyudclyu uuljhvljh ufyyffc";
	  int numberOfCount=1;
      
      //this logic will count number of spaces in a string
      for(int i=0;i<sentence.length();i++)
      {
    	 if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!=' ' )
    	 {
    		 numberOfCount++;
    	 }
      }
      
      System.out.println(numberOfCount);
	}
	
	public static void evenOddNumbersInArray()
	{
		int[] array= {10,20,30,40,65,88,64,654,5};
	}
	
	public static void reverseNumber()
	{
		int numberToRverse=486543545;
		int temp=0;
		int reverse=0;
		
		while(numberToRverse>0)
		{
			temp=numberToRverse%10;
			reverse=reverse*10+temp;
			numberToRverse=numberToRverse/10;
		}
		
		System.out.println(reverse);
	}
	
	public static void reverseString()
	{
		String stringToReverse="fgbaybfgyo";
		
		String reverse="";
		
		for(int i=stringToReverse.length()-1;i>=0;i--)
		{
			char temp=stringToReverse.charAt(i);
			reverse=reverse+temp;
		}
		System.out.println(reverse);
		
	}
	
	public static void occuaranceOfVowelsInAString()
	{
		String testing="aehbaaaidDBuJiibjojbaijcu";
		int count=0;
		for(int i=0;i<testing.length();i++)
		{
			char character=testing.charAt(i);
			if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u' )
			{
				for(int j=0;j<testing.length();j++)
				{
					if(character==testing.charAt(j))
					{
						testing.replace(character, ' ');
						count ++;
					}
				}
				System.out.println("Number of occurance of vowel-"+character+" is "+count);
				count=0;
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
//		arraySort();
//		checkingANumberIsInArray();
//		findnumberofevenOdds();
//		countNumberOfDigitsInNumber();
//		lettersInAString();
//		wordsInAString();
//		reverseString();
		occuaranceOfVowelsInAString();
		
		
		
		
	}

}

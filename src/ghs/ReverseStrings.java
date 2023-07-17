package ghs;

import java.util.Scanner;

public class ReverseStrings {

	public static void occuaranceOfVowelsInAString()
	{
		String testing="aehbaaaidDBuJiibjojbaijcu";
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		
		for(int i=0;i<testing.length();i++)
		{
			char letter=testing.charAt(i);
			if(letter=='a' || letter=='e' || letter=='i' ||letter=='o' ||letter=='u')
			{
				if(letter=='a')
				{
					aCount++;
				}
				else if(letter=='e')
				{
					eCount++;
				}
				else if(letter=='i')
				{
					iCount++;
				}
				else if(letter=='o')
				{
					oCount++;
				}
				else if(letter=='u')
				{
					uCount++;
				}
				else 
				{
					System.out.println("letter is not vowel "+letter);
				}
			}
		}
		System.out.println(aCount);	
		System.out.println(eCount);	
		System.out.println(iCount);	
		System.out.println(oCount);	
		System.out.println(uCount);	
	}
	
	wordsInAString
	
	
	
	
	public static void main(String[] args)
	{
		occuaranceOfVowelsInAString();
	}
	

}

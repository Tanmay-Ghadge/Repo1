package java_Interview_Questions;

public class ReverseString 
{
	public static void main(String[] args) 
	{

		String str="kahdyevb";
	
		String reverse="";
		/*
		int lenghtOfString=str.length();

		for(int i=lenghtOfString-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}

		System.out.println(reverse);
      */
		
		//char array
		char a[]=str.toCharArray();
		int length=a.length;
		
		for(int i=length-1;i>=0;i--)	
		{
			reverse=reverse+a[i];	
		}
		System.out.println(reverse);
		
		
		
		
	}

}

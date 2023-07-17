
public class Test1 {

	//1.  Factorial
	public  void findFactorial(int FactorialNumber)
	{
        int number=FactorialNumber;
        int factorial=1;
        
        for(int i=number;i>1;i--)
        {
        	System.out.println(factorial+" "+ i);
        	factorial=factorial*i;
        	System.out.println(i);
        }
	System.out.println(factorial);
	}

	public void maxAndMinNumberInArray()
	{
		int a2[]= {561456,564,213,1,86,615,4661,55615,1,658,6,548,61,651615,565,5,4,};
		
		int max=a2[0];
		int min=a2[0];
		
		for(int a:a2)
		{
			if(a>max)
			{
				max=a;
			}
			if(a<min)
			{
				min=a;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public void reverseString()
	{
		String stringToReverse="Tanmay";
		String reverseString="";
	
		for(int i=stringToReverse.length()-1;i>=0;i--)
		{
			char c=stringToReverse.charAt(i);
			reverseString=reverseString+c;
		}
		System.out.println(reverseString);
	}
	
	public void reverseStrings()
	{
		String s="tanmay";
		
		char[] array=s.toCharArray();
		
		String reverseString="";
		
		for(int i=array.length-1;i>=0;i--)
		{
			reverseString=reverseString+array[i];
		}
		System.out.println(reverseString);
		
	}
	
	void reverseNumber()
	{
		int number=6545312;
		int reverse=0;
		while(number>0)
		{
			//get last number, remainder
			int temp=number%10;
			reverse=reverse*10+temp;
		//reassigning the value
			number=number/10;
		}
		System.out.println(reverse);
		
		
	}
	
	void wordsInASring()
	{
	String a="My name is tanmay";
	int count=1;
	
	for(int i=0;i<=a.length()-1;i++)
	{
		 char aa=a.charAt(i);
		 char b=a.charAt(i+1);
		 if(aa==' ' && b!=' ')
		 {
			 count++; 
		 }
		 
	}
	 System.out.println(count);
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Test1 obj1=new Test1();
		//obj1.findFactorial(5);
        //obj1.maxAndMinNumberInArray();
          obj1.wordsInASring();
	}

	
		
	}



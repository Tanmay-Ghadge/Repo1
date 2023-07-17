package java_Interview_Questions;

public class FindElementInArrayBinarySearch 
{

	public static void main(String[] args) 
	{
		//find element 90 is present in this array or not 
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		
		
		
		int initialNumber;
		int finalNumber;
		
		
		
		int expectedValue=90;
		int middleValue;
		middleValue=(0+a.length-1)/2;
		
		
		if(a[middleValue]>expectedValue)
		{
			finalNumber=(0+middleValue)/2;
		
			for(int i=0;i<finalNumber;i++)
			{
				if(a[i]==expectedValue)
				{
					System.out.println("expectedValue "+expectedValue+" is present at index number "+i);
					System.out.println("in if block");
					break;
				}
			}
		}
		else
		{
			initialNumber=((middleValue+1)+a.length-1)/2;
			
			for(int i=initialNumber;i<a.length;initialNumber++)
			{
				if(a[i]==expectedValue)
				{
					System.out.println("expectedValue "+expectedValue+" is present at index number "+(i+4));
					System.out.println("in else block");
					break;
				}
			}
			
			
		}
		
		
	}

}

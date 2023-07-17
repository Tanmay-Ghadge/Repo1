package java_Interview_Questions;

public class CountEvenOddInNumber {

	public static void main(String[] args) 
	{

		int num=22222222;
		
		int evenCount=0;
		int oddCount=0;
		
		while(num>0)
		{
			if(num%2==0)
				evenCount++;
			else
				oddCount++;
			
			num=num/10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		
	}

}

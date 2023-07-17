package java_Interview_Questions;

public class MissingNumberInArray {

	public static void main(String[] args) 
	{

		int a[]= {1,2,3,4,5,6,7,8,9,10,12,13,14,15};
		
		int sum1=0;
		int sum2=0;
		int nextNumber;
		
		for(int nextNumber1:a)
		{
			sum1=sum1+nextNumber1;
		}
		System.out.println("sum of elements="+sum1);
		
		for(int i=1;i<=15;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("sum of range of elements="+sum2);
		
		System.out.println("missing number is="+(sum2-sum1));
	}

}

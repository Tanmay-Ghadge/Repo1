package java_Interview_Questions;

public class MaxMinNumberInArray {

	public static void main(String[] args) 
	{
		int a[]= {15,98,451,65,32,4,9,74,4,51,54};
		
		int max=a[0];
		int min=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}

}

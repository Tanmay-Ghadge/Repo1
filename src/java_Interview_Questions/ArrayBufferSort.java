package java_Interview_Questions;

import java.util.Arrays;

public class ArrayBufferSort {

	public static void main(String[] args)
	{

		int[]a= {4,3,2,5,1};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}

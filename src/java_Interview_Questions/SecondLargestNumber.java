package java_Interview_Questions;

public class SecondLargestNumber {

	public static void main(String[] args)
	{
       int a=1;
       int b=2;
       int c=3;
       
      int[]aa= {2,1,3};
       
      for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa.length;j++)
			{
				if(aa[j]>aa[j+1])
				{
					int temp=aa[j];
					aa[j]=aa[j+1];
					aa[j+1]=temp;
				}
			}
		}
      
      System.out.println("second largest number is "+aa[1]);
       
		
	}

}

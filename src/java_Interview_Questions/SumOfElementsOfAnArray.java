package java_Interview_Questions;

public class SumOfElementsOfAnArray {

	public static void main(String[] args) 
	{
       int[] a= {1,2,3,4};
       
       int sum=0;
       
       for(int number:a)
       {
    	   sum= sum+number;
       }
       
       System.out.println(sum);
	}

}

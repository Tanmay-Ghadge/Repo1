 package java_Interview_Questions;

public class LargestOf3Numbers {

	public static void main(String[] args)
	{

		int a=1;
		int b=3;
		int c=4;
		
		if(a>b && a>c)
			System.out.println("a is the largest number");
		else if(b>a && b>c)
		{
			System.out.println("b is the largest number");
		}
		else
		{
			System.out.println("c is the largest number");
		}
		
		
	}

}

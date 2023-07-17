package java_Interview_Questions;

public class IsElementPresentInArray 
{

	public static void main(String[] args)
	{

		int a[]= {85,65,84,649,652,6478,9987,61,628,54};
		int element=9987;
		
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("element is present at index="+i);
				break;
			}
		}
		
		
		
		
	}

}

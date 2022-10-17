package java_Interview_Questions;

public class CheckingANumberISInArray
{
	public static void main(String[] args) 
	{
		int[] a= new int[] {10,20,30,40,50,60,70};
		boolean jvhajs=false;
		for(int each:a)
		{
			if(each==60)
			{
				System.out.println("Elment is there");
				jvhajs=true;
				break;
			}
			
		}

		if(jvhajs==false)
		{
			System.out.println("element is there");
		}
	}

}

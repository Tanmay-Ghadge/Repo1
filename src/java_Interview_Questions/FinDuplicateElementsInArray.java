package java_Interview_Questions;

public class FinDuplicateElementsInArray 
{

	public static void main(String[] args)
	{

		String[] str= {"java","c","python","java","c#","python"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				String arrayElement=str[i];
				if(str[j].equals(arrayElement)) 
				{
					System.out.println(str[j]+" is duplicated");
					break;
				}
			}
		}
		
		
	}

}

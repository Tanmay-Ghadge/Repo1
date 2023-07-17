package patterns;

public class HillPattern2 {

	public static void main(String[] args) 
	{

		int n=9;
		
		for(int i=1;i<=n;i++)
		{
			//decreaing
			for(int j=i;j<n;j++)
			{
				System.out.print("  "); 
			}
			
            //increasing
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			 //increasing
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			
			//decreaing
			for(int j=i;j<n;j++)
			{
				System.out.print("  "); 
			}
			
			//decreaing
			for(int j=i;j<n;j++)
			{
				System.out.print("  "); 
			}
			
            //increasing
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			 //increasing
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			
			//decreaing
			for(int j=i;j<=n;j++)
			{
				System.out.print("  "); 
			}
			
			System.out.println();
			
			
		}
		
	}

}

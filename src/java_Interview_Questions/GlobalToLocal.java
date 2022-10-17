package java_Interview_Questions;

public class GlobalToLocal {

	String driver;
	
	void ahjsch()
	{
		driver="local value";
	}
	
	public static void main(String[] args) 
	{
		
		GlobalToLocal obj=new GlobalToLocal();
		GlobalToLocal obj2=new GlobalToLocal();
		System.out.println(obj.driver);//null
		obj.ahjsch();
		System.out.println(obj.driver);//"local value" 
	    System.out.println(obj2.driver);

	}

}

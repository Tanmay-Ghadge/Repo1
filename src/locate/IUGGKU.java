package locate;

public class IUGGKU 
{
    int a;
    
    void hvcsvdch()
    {
    	a=10;
    }
	
	public static void main(String[] args) 
	{
		IUGGKU obj1=new IUGGKU();
		IUGGKU obj2=new IUGGKU();
		
		System.out.println(obj1.a);//0
		obj1.hvcsvdch();
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//0
	}

}

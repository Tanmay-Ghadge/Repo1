package locate;

import locate.SwiggyTextAutomation;
import org.testng.Assert;

public class Swiggy {

	public static void main(String[] args) 
	{
		SwiggyTextAutomation swiggy=new SwiggyTextAutomation();
		//System.out.println(swiggy.a);
		String a=swiggy.m1();
		System.out.println(a);
	}
}

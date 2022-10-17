package java_Interview_Questions;

public class SwappingTwoNumbers {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		//logic 1-creating third variable
		System.out.println("before-->"+"+a="+a+" "+"b="+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("after-->"+"+a="+a+" "+"b="+b);
		
		
		//logic 2- without using third variable
		System.out.println("before-->"+"+a="+a+" "+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after-->"+"+a="+a+" "+"b="+b);

		
		//logic 3
		System.out.println("before-->"+"+a="+a+" "+"b="+b);
		a=a*b;// a=200
		b=a/b;// b=10
		a=a/b;// a=20;
		System.out.println("after-->"+"+a="+a+" "+"b="+b);
  
	}

}

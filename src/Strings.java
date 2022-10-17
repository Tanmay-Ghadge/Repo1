import org.testng.annotations.Test;

public class Strings {

	
	public static void main(String[] args) 
	{
//		String s =new String("tanmay");
//		System.out.println("before hashcode-"+s.hashCode());
//		s=s.concat("ghadge");
//		System.out.println("after hashcode-"+s.hashCode());
//
//		System.out.println(s);

		StringBuffer s =new StringBuffer("tanmay");
		System.out.println("before hashcode-"+s.hashCode());
		s=s.append("ghadge");
		System.out.println("after hashcode-"+s.hashCode());

		System.out.println(s);
		
		
	}

}

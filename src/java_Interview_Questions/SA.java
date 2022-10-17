package java_Interview_Questions;

public class SA {

	public static void main(String[] args)
	{
		String horizontalDistance="0";
	 	String verticalDistance="350";
	   // js.executeScript("window.scrollBy(0,350)","");
	 	String se="this is my \"data\" in the string";	
		
		
		String s="window.scrollBy("+horizontalDistance+","+verticalDistance+")"+","+"\"\"";
		System.out.println(s);
	}

}

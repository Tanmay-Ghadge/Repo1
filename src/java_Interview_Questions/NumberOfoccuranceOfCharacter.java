package java_Interview_Questions;

public class NumberOfoccuranceOfCharacter 
{
	public static void main(String[] args) 
	{
		String str="jhbadvv ibsbHBVC IDBJFBWFIBkijvbsvbe hfihgiuf uiwgfgfgfjhsffhf ueygwuefgfugvf";
		int totalLength=str.length();
		
		int lengthafter =str.replace("f","").length();
		int count=totalLength-lengthafter;
		System.out.println(count);
		
		
	}

}

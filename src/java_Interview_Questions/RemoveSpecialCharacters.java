package java_Interview_Questions;

public class RemoveSpecialCharacters 
{

	public static void main(String[] args) 
	{
		String str="!j#a#va*&tea%$+p*oi$n%t";
		String str2 = str.replaceAll("[a-zA-Z0-9]", "");
		String str3=	str.replaceAll("[^a-zA-Z0-9]","");
	
		System.out.println(str2);
		System.out.println(str3);
	
	
	}
}

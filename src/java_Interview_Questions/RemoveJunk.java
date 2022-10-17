package java_Interview_Questions;

public class RemoveJunk
{
	public static void main(String[] args) 
	{
	  int a=1;
      String s="+*+-=-?>+a+aselenium<:@#$$%%^ training&&&&A8";
     
       s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}

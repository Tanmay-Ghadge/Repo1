package java_Interview_Questions;

public class ReverseWordsInString {

	public static void main(String[] args) 
	{
		//approch 1
      String str="welcome to java";
      
      //add each word into array
      
      String[] words=str.split(" ");
      String reverseString="";
      
      for(String word:words)
      {
    	  String reverseword="";
    	  for(int i=word.length()-1;i>=0;i--)
    	  {
    		  reverseword=reverseword+ word.charAt(i);
    	  }
    	  reverseString=reverseString+reverseword+" ";
      }
      System.out.println(reverseString);
	
	
	
    //approch 1
 	 String str1="reverse this tring by sung String builder";
      String[] words2=str1.split(" ");
      String reverseBuilder2=""; 
      
      for(String word2:words2)
      {
     	 StringBuilder sbuilder=new StringBuilder(word2);
     	 StringBuilder reverseBuilder= sbuilder.reverse();
     	 
     	reverseBuilder2=reverseBuilder2+reverseBuilder.toString()+" ";
      }
	System.out.println(reverseBuilder2);
	
	
	
	
	
	
	
	
	}

	
}

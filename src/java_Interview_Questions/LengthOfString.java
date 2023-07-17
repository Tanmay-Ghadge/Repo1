
package java_Interview_Questions;

public class LengthOfString
{

	public static void main(String[] args) 
	{
       String string="find length of this string without using legth method";
       int i=0;
       for(char c:string.toCharArray())
       {
    	   i++;
       }
       System.out.println("lenghth of given string="+i+string.length());

	}
 
}

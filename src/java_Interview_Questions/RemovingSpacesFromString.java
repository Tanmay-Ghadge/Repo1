package java_Interview_Questions;

public class RemovingSpacesFromString {

	public static void main(String[] args)
	{
        String str="kcbjc vjhzjhvh     jbkvavkbj    ljvbbklb";
        
        str=str.replaceAll("\\s","");
        System.out.println(str);
	}

}

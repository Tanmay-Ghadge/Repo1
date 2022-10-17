package java_Interview_Questions;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrray 
{
	public static void main(String[] args)
	{
		Integer[] array=new Integer[] {20,98,654,346,424};
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

}

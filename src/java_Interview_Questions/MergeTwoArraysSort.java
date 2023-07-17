package java_Interview_Questions;

import java.util.Arrays;

public class MergeTwoArraysSort 
{
	public static void main(String[] args) 
	{

		int array1[]= {10,20,30,40,50};
		int array2[]= {9,18,27,36,45};
		
		//create new array of the size equal to both array
		int mergedArray[]=new int[array1.length+array2.length];
		
		//copy array1 to mergedArray
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		
		//copy array2 to mergedArray
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
		
		//sort new array
		Arrays.sort(mergedArray);
		System.out.println(Arrays.toString(mergedArray));
	}

}

package java_Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindHighestValueInArray 
{
	public static void main(String[] args) 
	{
		int[] array=new int[] {854,6545,648,611,54,5,541,5412,641,15,4,1,5525};
		Set sortMe=new TreeSet();

		for(int each:array)
		{
			sortMe.add(each);
		}

		List list=new ArrayList(sortMe);
		System.out.println(list.get(list.size()-1));


	}





}

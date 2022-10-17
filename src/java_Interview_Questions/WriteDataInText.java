package java_Interview_Questions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInText 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("C:\\Users\\tusha\\Documents\\learning\\java full course\\i_created_this_file.txt");
        
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("hi!!!!!!");
		bw.write("i created this txt file through programme");
		bw.close();
		
		
	}

}

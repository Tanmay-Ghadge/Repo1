package codeStudio;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksApproch2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //open url
		 driver.get("https://blog.hubspot.com/blog/tabid/6307/bid/33766/10-clever-website-error-messages-from-creative-companies.aspx");
		 //driver.get("https://www.theworldsworstwebsiteever.com/");
		// driver.get("https://www.hyrtutorials.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 //find all hyper links in this page
		 List <WebElement> urls=driver.findElements(By.tagName("a"));
		 
		 //required declarations
		 int responseCode;
		 
		 Set <String> brokenURLs= new HashSet <String>();
		 
		 //find broken links
		 for(WebElement url:urls)
		 {
			//get each url
			 String urlLink=url.getAttribute("href");
			 
			
			 try 
			 {
			   //open each link
			   URL urlObject= new URL(urlLink);	
			   
			   //open a connection without proxy
			 URLConnection urlConnection = urlObject.openConnection();
			 
			 //type casting
			 
			 HttpURLConnection huc=(HttpURLConnection) urlConnection;
			 
			 // before connecting giving a timeout to avoid timeout exception
			// huc.setConnectTimeout(5);
			 
			 //send request to each url
			 huc.connect();
				 
			 responseCode=huc.getResponseCode();
			 
			 if(responseCode > 200)
			 {
				 brokenURLs.add(urlLink);

			    System.out.println(responseCode);
				
				System.out.println(url.getText());
				
				for(String brokenURL:brokenURLs)
				 {
					 System.err.println( brokenURL);
					 System.out.println("---------------------------");
					 break;
				 }
				
			 }
			
			
			 
			 huc.disconnect();
			 
			 } 
			 catch (MalformedURLException e) 
			 {
				
			 } 
			 catch (IOException e) 
			 {
				
			 }
			
		 }	
		 System.out.println("Total number of links present in this page:"+urls.size());
		 System.out.println("Total number of broken links present in this page:"+brokenURLs.size());
		 driver.quit();	 
	}

}

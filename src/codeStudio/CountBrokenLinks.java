package codeStudio;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountBrokenLinks
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		//launch browser
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //open URL
		 // 
		 driver.get("https://blog.hubspot.com/blog/tabid/6307/bid/33766/10-clever-website-error-messages-from-creative-companies.aspx");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //find all hyper links first
		List <WebElement> allHyperLinks=driver.findElements(By.tagName("a"));
		
		//Print total number of hyper links present in this web page
		System.out.println("total number of links present in a webpage="+allHyperLinks.size());
		
		int responseCode;
		
		int brokenLinks=0;
		
		
		//capture url's of each hyperlink
		for(WebElement e1:allHyperLinks)
		{
		  String url=e1.getAttribute("href");
		  
		  try
		  {
		   // open each url
			URL urlLink=new URL(url);
		     
		   //send request to each url
		   HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();	
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			responseCode=huc.getResponseCode();
			
			if(responseCode >=400)
			{
				System.out.println(url+"-->link is broken");
				brokenLinks++;			
			}
			
		  } 
		  catch (MalformedURLException e)
		  {
		  }
		  catch (Exception e2)
		  {
		  }
		  
		}
		System.out.println("Total number of broken links="+brokenLinks);
		driver.quit();	
	}
	

}

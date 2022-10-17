package codeStudio;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksWithParalelStream 
{
	
	static int responseCode=200;
	
	static int brokenLinks=0;
	
	
	public static void checkBrokenLink(String url)
	{ 
			  try
			  {
			   // open each url
				URL urlLink=new URL(url);
			     
			   //send request to each url
			   HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();	
				huc.setRequestMethod("HEAD");
				huc.setConnectTimeout(1000);
				huc.connect();
				
				responseCode=huc.getResponseCode();
				
				if(responseCode >=400)
				{
					System.out.println(responseCode);
					System.out.println(url+"-->link is broken");
					brokenLinks++;
					System.out.println("-------------");
					
				}
				
			  } 
			  catch (MalformedURLException e)
			  {
			  }
			  catch (Exception e2)
			  {
			  }
			}
			 
	 

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.deadlinkcity.com/");
		 //driver.get("https://blog.hubspot.com/blog/tabid/6307/bid/33766/10-clever-website-error-messages-from-creative-companies.aspx");

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //find all hyper links first
		List <WebElement> allHyperLinks=driver.findElements(By.tagName("a"));
		allHyperLinks.addAll(driver.findElements(By.tagName("img")));
		
		//checkBrokenLink(allHyperLinks);
		
		List <String> urlList=new ArrayList <String>();
		
		//capture url's of each hyperlink
		for(WebElement e1:allHyperLinks)
		{
		  String url=e1.getAttribute("href");
		  urlList.add(url);
		}
		
		urlList.parallelStream().forEach(e -> checkBrokenLink(e) );
		
		
		
		
		
		
		System.out.println("Total number of links="+allHyperLinks.size());
		System.out.println("Total number of broken links="+brokenLinks);
	
		
		
		
	}

}

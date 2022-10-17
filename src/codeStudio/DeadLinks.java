package codeStudio;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeadLinks 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //driver.get("

		 driver.get("http://www.deadlinkcity.com/");
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 List <WebElement> hyperlinks=driver.findElements(By.tagName("a"));
		 
		System.out.println("total ancher tags in a website-"+hyperlinks.size());
		 
		 int responseCode=200;
		 String responseMessage;
		 int brokenLinks=0;// need/must to initialise
		 int successlink=0;
		 int notFoundLinks=0;
		 
		 for (WebElement webElement : hyperlinks) 
		 {
			 //capture each url
			String url=webElement.getAttribute("href");
			
			try 
			{
				//open each url
				URL urlLinks=new URL(url);
				
				//open connection
				HttpURLConnection huc=(HttpURLConnection)urlLinks.openConnection();
				
				//send request to each url
				huc.connect();
				responseCode=huc.getResponseCode();
				responseMessage=huc.getResponseMessage();
				
				if(responseCode >= 400)
				{
					brokenLinks++;
					System.out.println("response code:"+responseCode);
					System.out.println("error message:"+responseMessage);
					System.out.println(url+"--> broken link number:"+brokenLinks);
					System.out.println(webElement.getText());
					System.out.println("-------------------------------");
				
					}
				else if(responseCode <= 400)
				{
					successlink++;
					System.out.println("response code:"+responseCode);
					System.out.println("error message:"+responseMessage);
					System.out.println(url+"--> successful link number:"+successlink);
					System.out.println(webElement.getText());
					System.out.println("-------------------------------");		
				}
				else
				{
					notFoundLinks++;
					System.out.println("response code:"+responseCode);
					System.out.println("error message:"+responseMessage);
					System.out.println(url+"--> notFoundLinks link number:"+notFoundLinks);
					System.out.println(webElement.getText());
					System.out.println("-------------------------------");	
					
				}
			} 
			catch (MalformedURLException e) 
			{
				
			} catch (Exception e2) 
			{	
			}
		 }
		 System.out.println("total number of hyperlinks present in this page:"+hyperlinks.size());
		 System.out.println("Total broken links present in this webpage="+brokenLinks);	 
		 System.out.println("Total success links present in this webpage="+successlink);
		 System.out.println("Total notFound links present in this webpage="+notFoundLinks);
		 
		 
		 driver.quit();

	}

}

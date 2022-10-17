package codeStudio;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksWithProxy 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.twoplugs.com/");
		 
		//find all hyper links in this page
		 List <WebElement> urls=driver.findElements(By.tagName("a"));
		 
		 //required declarations
		 int responseCode;
		 
		
		 
		 for( WebElement url:urls)
		 {
			String urlLink= url.getAttribute("href");
			
			try 
			{
				URL urlObject=new URL(urlLink);
				
		  // create object of proxy 		
		  Proxy proxy=new Proxy(java.net.Proxy.Type.HTTP,new InetSocketAddress("hostname",80));
				urlObject.openConnection(proxy);
				
				HttpURLConnection huc=(HttpURLConnection) urlObject.openConnection(proxy);
				
				huc.connect();
				
				responseCode=huc.getResponseCode();
				
				if(responseCode >= 400)
				{
					System.out.println(urlLink);
					
				}
			
			} 
			catch (MalformedURLException e)
			{
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			 
			 
			 
		 }
		 

	}

}

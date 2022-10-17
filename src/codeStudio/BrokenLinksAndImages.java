package codeStudio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAndImages 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://blog.hubspot.com/blog/tabid/6307/bid/33766/10-clever-website-error-messages-from-creative-companies.aspx");

	   //finding all the links first from img and ancher tags
		List <WebElement> links= driver.findElements(By.tagName("img"));
		links.addAll(driver.findElements(By.tagName("a")));   
		
		List <String> actualLinks=new ArrayList();

		//filter out links from these tags
		for (WebElement link : links) 
		{
			
			String hrefLinks= link.getAttribute("href");
			String srcLinks= link.getAttribute("src");
			
			if(hrefLinks!=null)
			{
				if(hrefLinks.contains("http"))
						actualLinks.add(hrefLinks);
			}
			
			if(srcLinks!=null)
			{
				if(srcLinks.contains("http"))
				{
					actualLinks.add(srcLinks);
				}
			}
			
			
			
			/*
			if(hrefLinks!=null || srcLinks!=null)
			{
				if(hrefLinks.contains("http") || srcLinks.contains("http"))
				{
					actualLinks.add(link);
				}
			}
			
			*/
			
		}
		for (String urls : actualLinks) 
		{
			System.out.println(urls);
		} 
		
		System.out.println("all tags--"+links.size());
		System.out.println("actual links--"+actualLinks.size());
		driver.quit();
	
	
	
	
	
	}

}

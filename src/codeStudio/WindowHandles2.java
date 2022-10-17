package codeStudio;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.zomato.com/who-we-are");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		String parenWindowID= driver.getWindowHandle();
		String parentTitle=driver.getTitle();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)","");
		
		List <WebElement> socialMediaWebsites=driver.findElements(By.xpath(""
				+ ""));
		
		for (WebElement websites : socialMediaWebsites) 
		{
			websites.click();
		}
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set <String> list=  driver.getWindowHandles();
		System.out.println("total tabs currently open="+list.size());
		
		List <String> windowHandles=new ArrayList <String>(list);
		
		for (String windowHandle : list) 
		{
			driver.switchTo().window(windowHandle);
			String siteTitle=driver.getTitle();
			String  siteID=driver.getWindowHandle();
			
			//System.out.println("page window Handle ID--"+siteID);
			System.out.println("page Title --"+siteTitle);
			
			if(!siteTitle.equals(parentTitle))
			{
				
				Thread.sleep(2000);
				driver.close();
			
			}
			
		}//zomato,facebook,youtube,twitter,instagram,linkedin
	    // zomato,facebook,youtube,twitter,instagram,Linkedin
		
		
		

	}

}

package codeStudio;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles3
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //opening zomato website
		 driver.get("https://www.zomato.com/who-we-are");
		 
		 // getting parent window handle 
		 String parentWindowHandle=driver.getWindowHandle();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //scrolling down  
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,4400)","");
		 
		 //locating elements to click on-linkedIn on employees
		 List <WebElement> linkedInLinks=driver.findElements(By.xpath("//a[contains(@title,'-linkedIn')]"));
			
		 int serialNumber=0;
		 
		 //opening each linkedIn profile
		for (WebElement webElement : linkedInLinks) 
		 {
			 //clicking on first link
			Thread.sleep(4000);
			 webElement.click();// link opened
			 Thread.sleep(4000);
			 
			 //getting window handle at this time there will be 2 windows 1 parent one just opened page's
			 Set <String> windowHandles=driver.getWindowHandles();
			 
			 // iterating each window handle
			 for (String windowHandle : windowHandles)
			 { 	
			     if(!windowHandle.equals(parentWindowHandle))
			   {
					 driver.switchTo().window(windowHandle);
					 String pageTitle=driver.getTitle();
				    
				     if(pageTitle.contains("Sign In | LinkedIn"))
					   {
				    	 System.out.println(windowHandle+"-old Window Handle");
				    	 
							   driver.close();
							   
							   driver.switchTo().window(parentWindowHandle);
							   System.out.println(parentWindowHandle+"-parent Window Handle");
							   Thread.sleep(4000);
							   webElement.click();
							   Thread.sleep(4000);
							   
							Set<String> newWindowHandles=   driver.getWindowHandles();
							for (String newWindow : newWindowHandles) 
							{
								if(!newWindow.equals(parentWindowHandle))
								{
									System.out.println(newWindow+"-new Window id");
									driver.switchTo().window(newWindow);


									 String name= driver.findElement(By.xpath("//section[@class='profile']/section[1]/div/div[2]/div/h1")).getText();
									 //System.out.println(name+"'window handle Id-"+windowHandle);
									 serialNumber++;
									 System.out.println(serialNumber+"-name-"+name); 
									
									driver.close();
									driver.switchTo().window(parentWindowHandle);
									   
								}
							}
							
					
					   }
						else
					    {
							 String name= driver.findElement(By.xpath("//section[@class='profile']/section[1]/div/div[2]/div/h1")).getText();
							 //System.out.println(name+"'window handle Id-"+windowHandle);
							 serialNumber++;
							 System.out.println(serialNumber+"-name-"+name);  
							 driver.close();
							 driver.switchTo().window(parentWindowHandle);
							   
						}
			   }
		     }
			 
		 }
			
		 driver.quit();
		 }

}

package codeStudio;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingConclusions 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //opening zomato website
		 
		 driver.get("https://www.zomato.com/who-we-are");
		 
		// driver.switchTo().window("https://www.linkedin.com/in/gunjanpatidar/?original_referer=https%3A%2F%2Fwww.zomato.com%2F");
		driver.navigate().to("https://www.linkedin.com/in/gunjanpatidar/?original_referer=https%3A%2F%2Fwww.zomato.com%2F"); 
		
		
		
		
		WebElement link=driver.findElement(By.xpath("//a[@title='Deepinder Goyal-linkedIn']"));
		 
		 
		 
		/* driver.get("https://www.dominos.co.in/menu/veg-pizzas");
		 String parentHandle=driver.getWindowHandle();
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,5000)","");
		 
		 String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 driver.findElement(By.xpath("//div[@class='pg-content col-xs-12']/div[2]/p[5]/span/a")).sendKeys(s);
		
		 String s2=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 driver.findElement(By.xpath("//div[@class='pg-content col-xs-12']/div[2]/p[6]/span/a")).sendKeys(s2);
		 driver.findElement(By.xpath("//div[@class='pg-content col-xs-12']/div[2]/p[7]/span/a")).sendKeys(s2);
		
		 
		 Set <String> windowHandles=driver.getWindowHandles();
		 
		 for (String windowHandle : windowHandles)
		 {
			
				driver.switchTo().window(windowHandle);
				System.out.println(driver.getTitle()+" "+driver.getWindowHandle());	
				 Set <String> newWindowHandleSequence=driver.getWindowHandles();
				 System.out.println(newWindowHandleSequence);
				System.out.println("--------------------");
				
				if(windowHandle.equals(parentHandle))
				{
					driver.close();
				}
		 }
		 
		 System.out.println("-----------------new sequence-----------------------");
        
		 Set <String> windowHandles2=driver.getWindowHandles();
		 
		 for (String windowHandle2 : windowHandles2)
		 {
			
				driver.switchTo().window(windowHandle2);
				System.out.println(driver.getTitle()+" "+driver.getWindowHandle());	
				 Set <String> newWindowHandleSequence=driver.getWindowHandles();
				 System.out.println(newWindowHandleSequence);
				System.out.println("--------------------");
				
				
		 } */
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		

	}

}

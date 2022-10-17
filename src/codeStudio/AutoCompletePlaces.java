package codeStudio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletePlaces 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.twoplugs.com/");
		
		 
		 driver.findElement(By.xpath("//a[@href='/newsearchserviceneed']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement dropdown= driver.findElement(By.id("autocomplete"));
		 Thread.sleep(5000);
         dropdown.clear();
		 
		 
		 String place=dropdown.getAttribute("placeholder");	
		 
		 if(!place.isEmpty())
		 {
	         System.out.println("Place is already entered");
	         dropdown.clear();
	         System.out.println("Cleared already selected place");
	         dropdown.sendKeys("Delhi");
		 }
		 else
		 {
			System.out.println("No place added"); 
		 }
		 
		do
		{
			dropdown.sendKeys(Keys.ARROW_DOWN);
			String a=dropdown.getAttribute("value");
			Thread.sleep(3000);
			System.out.println(a);
			if(a.equals("New Delhi, Delhi, India"))
			{
				
				dropdown.sendKeys(Keys.ENTER);
				break;
			}
			
		}while(!place.isEmpty());
		Thread.sleep(3000);

	}

}

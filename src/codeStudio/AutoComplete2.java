package codeStudio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		 WebElement dropdown=driver.findElement(By.name("q"));
		 dropdown.sendKeys("samsung");
		 
		String text;
		
		do
		{
			dropdown.sendKeys(Keys.ARROW_DOWN);
			text=dropdown.getAttribute("value");
			System.out.println(text);
			
			
			if(text.equals("samsung f22 4 64"))
			{
				dropdown.sendKeys(Keys.ENTER);
				break;	
			}	
			Thread.sleep(3000);
			
		}while(!text.isBlank());

	}

}

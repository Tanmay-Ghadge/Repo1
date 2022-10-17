package locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNg1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\\\Drivers\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		//driver.manage().window().maximize();
		
		// Capturing text 1
		String actualText1=driver.findElement(By.className("sZsUd")).getText();
		System.out.println(actualText1);
		
			Thread.sleep(4000);
		
		// Capturing text 2
		String actualText2=driver.findElement(By.className("sZsUd")).getText();
		System.out.println(actualText2);
		
			Thread.sleep(4000);
			
		// Capturing text 3
		String actualText3=driver.findElement(By.className("sZsUd")).getText();
		System.out.println(actualText3);
		
			Thread.sleep(4000);
		
		// Capturing text 4
		String actualText4=driver.findElement(By.className("sZsUd")).getText();
		System.out.println(actualText4);
		
			Thread.sleep(4000);
			
		// Capturing text 5	
		String actualText5=driver.findElement(By.className("sZsUd")).getText();
		System.out.println(actualText5);
		
			Thread.sleep(4000);
		
		// Capturing text 6
		String actualText6=driver.findElement(By.className("sZsUd")).getText();
		System.out.println(actualText6);
		
			Thread.sleep(4000);
		
		// Capturing text 7 if any
		String actualText7=driver.findElement(By.className("sZsUd")).getText();
		
		if(actualText7.equals(actualText1)==true)
		{
			System.out.println("-------------all texts captured--------------");
		}
		else
		{
		System.out.println(actualText7);
		}
		
			driver.quit();
	}

}

package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		  
		  driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		 
		 WebElement element= driver.findElement(By.name("packageListFrame"));
		 driver.switchTo().frame("packageListFrame");
		  WebElement element2 =driver.findElement(By.linkText("org.openqa.selenium"));
		  
		  System.out.println(element2.getText());
		  element2.click();
		  
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame("packageFrame");
		  
		System.out.println(driver.findElement(By.linkText("Alert")).getText());  
		
		driver.switchTo().defaultContent();
		
		int numberOfFrames=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(numberOfFrames);
	    driver.quit();
		  

	}

}

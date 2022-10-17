package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCopyPaste 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/register");
		 
		 WebElement firstName=driver.findElement(By.id("FirstName"));
		 WebElement lastName=driver.findElement(By.id("LastName"));
		 firstName.sendKeys("tanmay");
		 
		 Actions act=new Actions(driver);
		 
		 act.moveToElement(firstName).keyDown(Keys.CONTROL).sendKeys("a","x").keyUp(Keys.CONTROL).perform();
		 act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		 
		 
		 
		 
		 
		 
		 
	}

}

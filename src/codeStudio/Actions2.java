package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.google.com/");

		 Actions act=new Actions(driver);
		 
	     WebElement searchBox=driver.findElement(By.name("q"));
	     
	     
	     
	    // act.keyDown(searchBox,Keys.SHIFT).sendKeys("t").keyUp(searchBox,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT)   .sendKeys("a").sendKeys(Keys.ARROW_RIGHT).keyDown(searchBox,Keys.SHIFT).sendKeys("n").keyUp(searchBox,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT) .sendKeys("m").sendKeys(Keys.ARROW_RIGHT).keyDown(searchBox,Keys.SHIFT).sendKeys("a").keyUp(searchBox,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT)   .sendKeys("y").sendKeys(Keys.ARROW_RIGHT).keyDown(searchBox,Keys.SHIFT).sendKeys(" ").keyUp(searchBox,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT) .sendKeys("S").sendKeys(Keys.ARROW_RIGHT).keyDown(searchBox,Keys.SHIFT).sendKeys("H").keyUp(searchBox,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT) .sendKeys("I").sendKeys(Keys.ARROW_RIGHT).keyDown(searchBox,Keys.SHIFT).sendKeys("V").keyUp(searchBox,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).build().perform();
	    
		// act.keyDown(searchBox,Keys.SHIFT).sendKeys("tanmay").keyUp(searchBox,Keys.SHIFT).perform(); act.sendKeys(" shiv").keyDown(searchBox, Keys.SHIFT).sendKeys("ajirao").keyUp(searchBox, Keys.SHIFT).perform();	  searchBox.sendKeys(Keys.DOWN);searchBox.sendKeys(Keys.ENTER);
		 
		act.keyDown(searchBox,Keys.SHIFT).sendKeys("tanmay").keyUp(searchBox,Keys.SHIFT).perform();

		Thread.sleep(2000);
		
		//searchBox.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN);// if shift is held then this will print in capital
		//act.keyDown(Keys.UP).perform();
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

package codeStudio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobot 
{

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 Actions act=new Actions(driver);
		 driver.get("http://demowebshop.tricentis.com/register");
		 
		 WebElement gender=driver.findElement(By.id("gender-male"));
		 act.moveToElement(gender).click().perform();
		
		/* act.sendKeys(Keys.TAB)
		 .sendKeys("test1")
		 .sendKeys(Keys.TAB)
		 .sendKeys("test2")
		 .sendKeys(Keys.ENTER)
		 .sendKeys("test@gmail.com")
		 .sendKeys(Keys.TAB)
		 .sendKeys("password")
		 .sendKeys(Keys.TAB)
		 .sendKeys("password")
		 .sendKeys(Keys.ENTER)
		 .perform();
		*/
		 
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 act.sendKeys("hi").perform();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 act.sendKeys("uuy").perform();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 act.sendKeys("test2@gmail.com").perform();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 act.sendKeys("password2").perform();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 act.sendKeys("password2").perform();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

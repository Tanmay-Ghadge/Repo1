package codeStudio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.website.com/?source=SC&country=IN");
		 
		/* WebElement elementToRightClickOn=driver.findElement(By.id("webmailFunction"));
		 
		 Point p=elementToRightClickOn.getLocation();
		 int x=p.getX();
		 int y=p.getY();
		 
		System.out.println("x-"+x+" "+"y-"+y);
		Actions action =new Actions(driver);
		//action.moveToElement(elementToRightClickOn).click().perform();
		*/
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.mouseMove(1190,400);
		
		
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		robot.delay(3000);
		
		for(int i=0;i<6;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.delay(500);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1800);
		
		robot.mouseMove(1250,400);
		robot.delay(2000);
		robot.mouseWheel(500);
		//driver.quit();
		
		 
		
		 
		 

	}

}

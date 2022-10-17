package codeStudio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDownloadPopUpFireFox 
{

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/download");
		WebElement download=driver.findElement(By.linkText("GNANESH.CV.docx"));
		download.click();
		
		Robot robotmama=new Robot();
		
		robotmama.keyPress(KeyEvent.VK_TAB);
		robotmama.keyRelease(KeyEvent.VK_TAB);
		
		robotmama.delay(2000);
		
		robotmama.keyPress(KeyEvent.VK_TAB);
		robotmama.keyRelease(KeyEvent.VK_TAB);
		
		robotmama.keyPress(KeyEvent.VK_ENTER);
		robotmama.keyRelease(KeyEvent.VK_ENTER); 
		
		
		
		

	}

}

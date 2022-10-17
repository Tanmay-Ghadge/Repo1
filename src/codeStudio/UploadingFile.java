package codeStudio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UploadingFile
{

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 driver.get("https://demoqa.com/upload-download");
		 WebElement uploadButton=driver.findElement(By.id("uploadFile"));
		 //approch 1-sendkeys() method
		 /*
		
		 uploadButton.sendKeys("C:\\Users\\tusha\\Desktop\\file to upload.txt"); 
		 */
		 //approch 2-Robot class
		 Actions act=new Actions(driver);
		 act.moveToElement(uploadButton).click().perform();
		 
		 Robot rb=new Robot();
		 rb.delay(5000);
		 
		 StringSelection filePath=new StringSelection("C:\\Users\\tusha\\Desktop\\file to upload.txt");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 
	//	 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

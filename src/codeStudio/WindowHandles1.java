package codeStudio;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 String parentWindowHandle=driver.getWindowHandle();
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)","");
		 
		 driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();
		 Set<String> setWindowHandles=driver.getWindowHandles();
		 
		 for (String uniqueWindowHandle : setWindowHandles) 
		 {
			if(uniqueWindowHandle!=parentWindowHandle)
			{
				
				System.out.println(uniqueWindowHandle+"--child window handle");
				driver.switchTo().window(uniqueWindowHandle);
			}
		 }
		 
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());     
		 driver.findElement(By.id("firstName")).sendKeys("Tanmay");
		 driver.findElement(By.id("lastName")).sendKeys("Ghadge");
		 
		List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[contains(@id,'chbx')]"));
		System.out.println("number of checkboxes available-"+checkBoxes.size());
		for (WebElement checkBox : checkBoxes) 
		{
			if(checkBox.getAttribute("id").equals("hindichbx"))
			{
				checkBox.click();
				break;
			}
			
		}
		driver.findElement(By.id("email")).sendKeys("ojlucjcs@email.com");
		driver.findElement(By.id("email")).sendKeys("password");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentWindowHandle);
		System.out.println("total number of windows-"+setWindowHandles.size());
	    System.out.println(driver.findElement(By.xpath("//h1[@itemprop='name']")).getText());	          
		driver.quit();
		}

}

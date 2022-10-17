package codeStudio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.crazydomains.com.au/managed-seo/?utm_source=google&utm_medium=cpc&utm_campaign=cid|16728939810|search&utm_content=gid|140688314128|aid|590581484122|placement|&utm_term=seo%20sydney&gclid=Cj0KCQjwuuKXBhCRARIsAC-gM0hEINhkp0E7T488YinAip95ZPDGbJRuUzvIqwJ0Gv-epwOlLjc3T7waAmKAEALw_wcB");
        
        // taking screenshot of the full screen
        /*TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
        
        File src=takeScreenshot.getScreenshotAs(OutputType.FILE);
        
        File saveLocationTarget=new File("new screenshot.png");
        
        FileUtils.copyFile(src,saveLocationTarget);
        */
        // taking screenshot of a section
        
        WebElement scetion= driver.findElement(By.xpath("//*[@id=\"g_page\"]/div[2]/div[2]/div/div[3]/div[1]/h2"));
        File src2= scetion.getScreenshotAs(OutputType.FILE);
        
        File target2=new File("sectionscreeShot.jpg");
        
        FileUtils.copyFile(src2, target2);
        
        
        // screenshot border using javascript executor
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='2px solid red'", scetion);
        
        
        
        
        
        
        
        driver.quit();
		
		
		
		
		
		
	}

}

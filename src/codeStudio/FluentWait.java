package codeStudio;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Stopwatch;

public class FluentWait
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://www.ebay.com/");
	     Stopwatch watch=null;
	     
	   /*  Wait <WebDriver> wait=new FluentWait<WebDriver>(driver)
	    		 .withTimeOut(Duration.ofSeconds(10))
	    		 .pollingEvery(Duration.ofSeconds(2))
	    		 .ignoring(NoSuchElementException.class);
	   */  
	     
	     try
	     {
	    	 watch=Stopwatch.createStarted();
	         driver.findElement(By.linkText("Home & Garden")).click();
	     }
	     catch(Exception e)
	     {
	    	 watch.stop();
	    	 System.out.println(e);
	    	 System.out.println(watch.elapsed(TimeUnit.SECONDS)+"-seconds");
	     }
	}

}

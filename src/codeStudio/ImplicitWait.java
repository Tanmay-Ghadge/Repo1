package codeStudio;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait
{

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://www.ebay.com/");
     Stopwatch watch=null;
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
         
        
         watch.stop();
         System.out.println();
         
         
         
     
	 
	}

}

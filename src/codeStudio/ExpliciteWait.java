package codeStudio;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExpliciteWait
{

	public static void main(String[] args) 
	{
		

		

			
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     driver.get("https://www.ebay.com/");
		     Stopwatch watch=null;
		     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		     
		     
		     try
		     {
		    	 watch=Stopwatch.createStarted();
		    	WebElement element2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Hom & Garden")));
		    	element2.click();
		    	
		     }
		     catch(Exception e)
		     {
		    	 watch.stop();
		    	 System.out.println(e);
		    	 System.out.println(watch.elapsed(TimeUnit.SECONDS)+"-seconds");
		     }
		         
		       
		         
		     
			 
			

	


	}

}

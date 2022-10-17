package codeStudio;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.uitestpractice.com/Students/Switchto");
		 
		 List <WebElement> alerts = new ArrayList();
		 alerts.add(driver.findElement(By.id("alert")));
		 alerts.add(driver.findElement(By.id("confirm")));
		 alerts.add(driver.findElement(By.id("prompt")));
		 
		 // this approch didnt offer any choce other than accepting the alert
		 // this method does not have provision of sending keys in prompt alert
		 for (WebElement alert : alerts) 
		 {
			 alert.click();
			 Thread.sleep(3000);
			 driver.switchTo().alert().accept();
			 System.out.println(driver.findElement(By.id("demo")).getText());
		 }
		 
	/*	 
		 
		 driver.switchTo().alert().accept();
	     	          
		 
		 .click();
		 Thread.sleep(3000);
         driver.switchTo().alert().dismiss();
         System.out.println(driver.findElement(By.id("demo")).getText());
         
         .click();
         Thread.sleep(3000);
         driver.switchTo().alert().sendKeys("Tanmay");
         driver.switchTo().alert().accept(); 
         System.out.println(driver.findElement(By.id("demo")).getText());
		 
		*/ 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

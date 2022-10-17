package codeStudio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		 
		 driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	     Alert normalAlert=driver.switchTo().alert();	             
		 System.out.println(normalAlert.getText());
		 Thread.sleep(3000);
		 normalAlert.accept();
		 
		 driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		 System.out.println(normalAlert.getText());
		 Thread.sleep(3000);
		 driver.switchTo().alert().dismiss();
		 
		 driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		 System.out.println(normalAlert.getText());
		 driver.switchTo().alert().sendKeys("asdcvbjuyt");
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		
		 driver.quit();
		

	}

}

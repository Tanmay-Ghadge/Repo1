package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
	   //driver.get("http://the-internet.herokuapp.com/basic_auth");
		 driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		 System.out.println(driver.findElement(By.tagName("p")).getText()); 

	}

}

package codeStudio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\chromedriver.exe");	
     
	 // Launch Chrome Browser
	 WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 
	 //open Google website
	 driver.navigate().to("https://www.google.com/");
	 
	 //get page title
	 String pageTitle=driver.getTitle();
	 System.out.println("Page tittle of current page: "+pageTitle);
	 
	 //get current URL
	String pageUrl=driver.getCurrentUrl();
	 System.out.println("Current page URL: "+pageUrl);
	 
	 //get page source
	 String pageSource=driver.getPageSource(); // when we try to print page source it is not printing previous printing statements
	 System.out.println("page source code: "+pageSource);
	 
	 //Close browser window
	 driver.quit();
	}

}

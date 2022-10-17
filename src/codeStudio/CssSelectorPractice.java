package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String titleloginPage=driver.getTitle();
		System.out.println(titleloginPage);
		
		String windowHandleloginPage=driver.getWindowHandle();
		System.out.println(windowHandleloginPage);
		
		//locate username and enter username
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		//locate password and enter password
		driver.findElement(By.cssSelector("input[name^=txtPassw")).sendKeys("admin123");
		
		//locate login and click
		driver.findElement(By.cssSelector("input.button[type=submit]")).click();
		
		String titlePage2=driver.getTitle();
		System.out.println(titlePage2);
		
		String windowHandlePage2=driver.getWindowHandle();
		System.out.println(windowHandlePage2);
		
		//locate my info
		driver.findElement(By.linkText("My Info")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)","");
		
		driver.findElement(By.cssSelector("input[id^=btnSave]")).click();
		
		driver.findElement(By.cssSelector("input[title*=First Name")).clear();
		//driver.findElement(By.cssSelector("input[title*=First Name")).sendKeys("Tanmay");

	}

}

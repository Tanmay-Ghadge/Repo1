package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeNested
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		 
	    List <WebElement> allIframeCount=driver.findElements(By.tagName("iframe"));
		System.out.println("all iframes in a page are-"+allIframeCount.size());
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		
		WebElement dropdownLocation=driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select dropdown=new Select(dropdownLocation);
		
		dropdown.selectByVisibleText("Avatar");
		
	}

}

package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.calculator.net/");
		 
		 List<WebElement> anchertag= driver.findElements(By.tagName("a"));
		 System.out.println("Number of hyperlinks in anchertag="+anchertag.size());
		 
		 //all href does not have a hyperlink
		 
		 for(WebElement el:anchertag)
		 {
			 System.out.println(el.getText()); 
		 }
		 
		
		 driver.quit();
		 
		
	}

}

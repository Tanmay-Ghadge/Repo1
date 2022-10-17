package codeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.bing.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		 
		 
		 List <WebElement> autoSuggestions=driver.findElements(By.xpath("//ul[@id='sa_ul']/li/div[2]/span"));
		 System.out.println("number of options in auto suggest="+autoSuggestions.size());
		
		 for(WebElement allOptions:autoSuggestions)
		 {
			 
			if(allOptions.getText().contains("download"))
			{
				allOptions.click();
				break;
			}
		 }
		
	 

	}

}

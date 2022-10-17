package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		// driver.get("https://designsystem.digital.gov/components/radio-buttons/");
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		 
		
		 List <WebElement>list=driver.findElements(By.className("usa-radio"));//8
		 List <WebElement>list2=driver.findElements(By.xpath("//input[@type='radio']"));//7
		 
		
		 System.out.println(list2.size());
		 
		 
		 driver.quit();
		 
		 
		 
		
			
			
	}

}

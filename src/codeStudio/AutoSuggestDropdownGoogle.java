package codeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdownGoogle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 List <WebElement> list =driver.findElements(By.xpath("//ul[@class='erkvQe' and @jsname='erkvQe']/div/ul/li/div//span"));
		 System.out.println(list.size());
		
		 
		 for (WebElement webElements : list) 
		 {
			if(webElements.getText().contains("selenium interview questions"))
			{
				webElements.click();
				break;
			}
		 }
		 driver.quit();

	}

}

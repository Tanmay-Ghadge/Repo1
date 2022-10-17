package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery4 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course//chromedriver.exe");
        
		//launch chrome browser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/multi-column-dropdown-select-bootstrap/");

		driver.findElement(By.id("btnLanguage")).click();
		
		List <WebElement> sucessfulList = driver.findElements(By.xpath("//div[@class='modal-body']/div[1]/div/div"));
		
		for (WebElement webElement : sucessfulList) 
		{
			if(webElement.getText().equals("Belarusian"))
            {
				webElement.click();
				break;
            }
		}
		System.out.println(sucessfulList.size());
		//driver.quit();
	}

}

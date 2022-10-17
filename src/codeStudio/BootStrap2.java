package codeStudio;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap2 {
	
	static void dropdownValues(List<WebElement> li,String value)
	{
		for(WebElement options:li)
		{
			if(options.getText().equals(value))
			{
				options.click();
				break;
			}
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
         driver.findElement(By.id("menu1")).click();
        List <WebElement> list= driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        
        dropdownValues(list,"CSS");
        System.out.println("Clicked");
        
        driver.navigate().to("https://mdbootstrap.com/docs/standard/components/dropdowns/#");
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)","");
		 js.executeScript("window.scrollBy(0,1000)","");
		 
		 driver.findElement(By.id("dropdownMenuButton")).click();
		 List <WebElement>ul=driver.findElements(By.xpath("//ul[@class='dropdown-menu show' and @aria-labelledby='dropdownMenuButton']/li"));
		 
		 dropdownValues(ul,"Another action");
        //driver.quit();
	}

}

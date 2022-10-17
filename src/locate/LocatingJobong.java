package locate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingJobong {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	      
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[4]/div/div/div/div/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click();

	}

}

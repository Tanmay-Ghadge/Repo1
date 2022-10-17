package codeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Actions act=new Actions(driver);
	
		 driver.get("https://demoqa.com/buttons");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickButton =driver.findElement(By.id("rightClickBtn"));
		WebElement clickButton =driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[2]/div[3]/button"));
		
		
		
		//creating object of Actions class
		
		
		//double click
		act.doubleClick(doubleClickButton).build().perform();
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		 
		// right click
		act.contextClick(rightClickButton).build().perform();
	    System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		
	    // click
		act.click(clickButton).perform();
	    System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
	    
	    driver.navigate().to("https://sellglobal.ebay.in/seller-center/");
	    driver.navigate().refresh();
	   List<WebElement> hoverElements=driver.findElements(By.xpath("//ul[@id='menu-header-1']/li/a"));
	   
	   for (WebElement webElement : hoverElements) 
	   {
			act.moveToElement(webElement).perform();
	   }

	}

}

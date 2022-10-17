package codeStudio;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)","");
		 
		 Actions act=new Actions(driver);
		
		 WebElement cityTarget1=driver.findElement(By.xpath("//div[@id='box1' ]"));
		 WebElement cityTarget2=driver.findElement(By.xpath("//div[@id='box2' ]"));
		 WebElement cityTarget3=driver.findElement(By.xpath("//div[@id='box3' ]"));
		 WebElement cityTarget4=driver.findElement(By.xpath("//div[@id='box4' ]"));
		 WebElement cityTarget5=driver.findElement(By.xpath("//div[@id='box5' ]"));
		 WebElement cityTarget6=driver.findElement(By.xpath("//div[@id='box6' ]"));
		 WebElement cityTarget7=driver.findElement(By.xpath("//div[@id='box7' ]"));
		 
		 
		 
		
		List <WebElement> countryTarget=driver.findElements(By.xpath("//div[contains(@id,'box10') ]"));
	   
		for (WebElement country : countryTarget) 
		{
		   if(country.getText().equals("Italy"))
		   {
			   act.dragAndDrop(cityTarget6, country).perform();
		   }
		   
		  if(country.getText().equals("Spain"))
		   {
			   act.dragAndDrop(cityTarget7, country).perform();
		   }
		   
		   if(country.getText().equals("Norway"))
		   {
			   act.dragAndDrop(cityTarget1, country).perform();
		   }
		   
		   if(country.getText().equals("Denmark"))
		   {
			   act.dragAndDrop(cityTarget4, country).perform();
		   }
		   
		   if(country.getText().equals("South Korea"))
		   {
			   act.dragAndDrop(cityTarget5, country).perform();
		   }
		   
		   if(country.getText().equals("Sweden"))
		   {
			   act.dragAndDrop(cityTarget2, country).perform();
		   }
		   
		   if(country.getText().equals("United States"))
		   {
			   act.dragAndDrop(cityTarget3, country).perform();
		   }
		   
		
		}
		
		
		// driver.quit();
		
	
		

	}

}

package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		 List <WebElement> cities= driver.findElements(By.xpath("//div[starts-with(@id,'box') and @class='dragableBox']"));
		 List <WebElement> countries= driver.findElements(By.xpath("//div[starts-with(@id,'box10')]"));
		 
		 int indexNumber=0;
		 Actions act=new Actions(driver);
		 
		  for (WebElement city : cities ) 
		 {
			  indexNumber++;
			for (WebElement country : countries) 
			{
				
			  act.dragAndDrop(city, country).perform();
			  String rgb=city.getAttribute("style");
			  
			  if(rgb.equals("visibility: visible; background-color: rgb(0, 255, 0);") )
			  {
				 countries.remove(indexNumber);
				 break; 
			  }
			  
			  
			  
			}
			 countries.remove(indexNumber) ;
			
		
		 }
		 
		 
	}

}

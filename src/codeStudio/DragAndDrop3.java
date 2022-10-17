package codeStudio;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		 List <WebElement> cities= driver.findElements(By.xpath("//div[starts-with(@id,'box') and @class='dragableBox']"));
		 List <WebElement> countries= driver.findElements(By.xpath("//div[starts-with(@id,'box10')]"));
	     WebElement dropHome= driver.findElement(By.id("dropContent"));
		 Actions act=new Actions(driver);
         ArrayList list=new ArrayList(cities);
		 
		 int indexNumberCities=0;
		 int indexNumberCountries=0;
		
		 for (WebElement country : countries) 
		 {
			 System.out.println("-------------------");
			 for (WebElement city : cities) 
			 {
				act.dragAndDrop(city, country).perform();
				
				String style=city.getAttribute("style");
				if(!style.contains("background-color: rgb(0, 255, 0);"))
				{
					act.dragAndDrop(city, dropHome).perform();
					Thread.sleep(1000);
					continue;	
					
				}
				else if(style.equals("visibility: visible; background-color: rgb(0, 255, 0);"))
				{
					//act.dragAndDrop(city, country).perform();
					cities.remove(city);
					Thread.sleep(1000);
					break;
				}
			
				
			
			 }
			
		 }
	}

}

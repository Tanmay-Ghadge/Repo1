package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdowns2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course//chromedriver.exe");
        
		//launch chrome browser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/jQuery-Plugin-For-Filterable-Bootstrap-Dropdown-Select-Bootstrap-Select/");
		
	   WebElement basicExample1=driver.findElement(By.id("bts-ex-1"));
	   WebElement basicExample2=driver.findElement(By.id("bts-ex-2"));
	   WebElement basicExample3=driver.findElement(By.id("bts-ex-3"));
	   WebElement basicExample4=driver.findElement(By.id("bts-ex-4"));
	   WebElement basicExample5=driver.findElement(By.id("bts-ex-5"));
	 
	  List <WebElement> list1=driver.findElements(By.xpath("//div[@id='bts-ex-1']/div/ul"));
	  List <WebElement> list2=driver.findElements(By.xpath("//div[@id='bts-ex-2']/div/ul"));
	  List <WebElement> list3=driver.findElements(By.xpath("//div[@id='bts-ex-3']/div/ul"));
	  List <WebElement> list4=driver.findElements(By.xpath("//div[@id='bts-ex-4']/div/ul"));
	  List <WebElement> list5=driver.findElements(By.xpath("//div[@id='bts-ex-5']/div/ul"));
	  
	  dropdownSelectOption(list1,basicExample3,"Item 2");
	  dropdownSelectOption(list2,basicExample3,"Item 2");
	  dropdownSelectOption(list3,basicExample3,"Item 2");
	  dropdownSelectOption(list4,basicExample3,"Item 2");
	  dropdownSelectOption(list5,basicExample3,"Item 2");
     
	  
	  
	  
	 // driver.quit();
	
	}
       
	public static void dropdownSelectOption(List <WebElement> list,WebElement location,String value)
	{
		location.click();
		for(WebElement allOptions:list)
		{
			
			//System.out.println(allOptions.getText());
			if(allOptions.getText().equals("value"))
			{
				allOptions.click();
				//break;
			}
			System.out.println( location.isSelected());
		}
	}
}

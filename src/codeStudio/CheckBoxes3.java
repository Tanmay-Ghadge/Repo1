package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes3
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//select individual checkbox option
		//driver.findElement(By.id("thursday")).click();
		
		//select all options using !forEach
	  List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
		
	 int numberOfCheckBoxOptions=checkboxes.size();
	  
		for(int i=0;i<numberOfCheckBoxOptions;i++)
		{
			checkboxes.get(i).click();
		}
	
		
		//select last 3 options
		// to do this first we need to know how many options are there
		for(int i=4;i<8;i++)
		{
			checkboxes.get(i).click();	
		}
		
		//first 2 options
		for(int i=0;i<2;i++)
		{
			checkboxes.get(i).click();
		}
		
		//select two predefined options
		
		for(WebElement option:checkboxes)
		{
			String a=option.getAttribute("id");
			if(a.equalsIgnoreCase("sunday") || a.equalsIgnoreCase("friday") )
			{
				option.click();
				
			}
		}
		
		
	
	
	
	
	
	
	
	
	
	//driver.quit();
	
	
	}

}

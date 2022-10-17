package codeStudio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropdown 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.twoplugs.com/");
		 
		 driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		 
		 WebElement selectDropdownLocation= driver.findElement(By.name ("category_id"));
		 
		 Select dropdown=new Select(selectDropdownLocation);
		 
		 ArrayList originalList=new ArrayList();
		 ArrayList tempList=new ArrayList();
		 
		List<WebElement> option= dropdown.getOptions();
		 
		for(WebElement allOptions:option)
		{
			originalList.add(allOptions.getText());
			tempList.add(allOptions.getText());
		}
		
		System.out.println("options in Original list="+originalList);
		System.out.println("options in temp list="+tempList);
		
        Collections.sort(tempList);
        
        System.out.println("options in temp list after sorting="+tempList);
        
        if(originalList.equals(tempList))
        {
        	System.out.println("options are sorted");
        }
        else
        {
        	System.out.println("options are not sorted");
        }
		
	  driver.quit();
	}

}

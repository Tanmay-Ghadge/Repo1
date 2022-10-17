package codeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown 
{
	public static void genericMethod(List <WebElement> li,String...value)
	{
		if(value.equals("all"))
		{
				for(WebElement options:li)
				{
					options.click();
					
				}
		}
		else if(!value.equals("all"))
		{
			for(WebElement option:li)
			{
				String allOPtions=option.getText();
				 
				for(String values:value)
				{
					if(allOPtions.equals(values))
					{
						option.click();
						System.out.println("123");
					}
				}				
			}
		  	
		}		
	}

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.id("justAnInputBox")).click();
		List <WebElement>list= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		genericMethod(list,"choice 1  ","choice 2 2","choice 3","choice 6 2 3","choice 2");
		
		//genericMethod(list,"all") ;
		System.out.println("clicked all options");
		//"//*[@id=\"comboTree178982DropDownContainer\"]/ul//li[@class='ComboTreeItemChlid' or @class='ComboTreeItemParent']
		//li[@class='ComboTreeItemChlid' or @class='ComboTreeItemParent']//span
		//span[@class='comboTreeItemTitle']
	}
	

}

package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//https://www.jquery-az.com/jquery/demo.php?ex=49.0_1
// use for multiple select based dropdown
public class DropDown4 {
	
	public static void dropdownlists(WebElement location,String value)
	{
		Select dropdown=new Select(location);
	    List <WebElement> allOptions=dropdown.getOptions();
		
		for( WebElement  options:allOptions)
		{			
			if(options.getText().equals(value))
			{
				options.click();
				break;
			}			
		}
		
	}

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://admin.formstack.com/signup/forms-teams?referring_type=s-temp-30-day-employee-review\r\n");
	
		WebElement drp1=driver.findElement(By.xpath("//select[@class='sc-iwajpm eahFYn' and @name='numberOfEmployees']"));
		dropdownlists(drp1,"1,000-5,000 employees" );
		
		WebElement drp2=driver.findElement(By.xpath("//select[@name='industry' and @class='sc-iwajpm eahFYn']"));
		dropdownlists(drp2,"Software & Technology");
		
	}

}

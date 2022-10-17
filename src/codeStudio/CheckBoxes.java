package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxes
{
	public static void chooseRadioOption(List <WebElement> list,String optionText)
	{
		for(WebElement option:list)
		{
			String attribute=option.getAttribute("id");
			if(attribute.equalsIgnoreCase(optionText))
			{
				option.click();
			}
			if(option.isSelected())
			{
				System.out.println(attribute+"-radio option is selected");
			}
			else
			{
				System.out.println(attribute+"-radio option is not selected");
			}
		}
	}
	
	public static void chooseCheckBoxOption(List <WebElement> list,String...value)
	{
		if(!value[0].equals("all"))
		{
			for(WebElement option3:list)
			{
				String option1=option3.getText();
				
				for(String values:value)
				{
					if(option1.equals(values))
					{
						option3.click();
						break;
					}
					
					if(option3.isSelected())
					{
						System.out.println(values+"-checkbox option is selected");
					}
				}				
			
			
			}							
		}
		else
		{
		  for(WebElement option:list)
		  {
		    option.click();
		    String a=option.getText();
		    if(option.isSelected())
		    {
		    	
		    	System.out.println(a+"-is selected");
		    }
		    else
		    {
		    	System.out.println(a+"-is not selected");
		    }
		  
		  }
		 
		  
		}
		
	}
	
	public static void chooseDropDownOption(WebElement dropdownLocation,String visibleText)
	{
		Select dropdown=new Select(dropdownLocation);
	    dropdown.selectByVisibleText(visibleText);	
	    if(dropdownLocation.isSelected())
	    {
	    	System.out.println("dropdown value"+" visibleText"+" is selected");
	    }
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://itera-qa.azurewebsites.net/home/automation");
		 
		 // print page title
		 System.out.println("page title-"+driver.getTitle());
		 
		 driver.findElement(By.id("name")).sendKeys("Tanmay Shivajirao Ghadge");
		 driver.findElement(By.cssSelector("input#phone")).sendKeys("987456321");
		 driver.findElement(By.cssSelector("input.form-control[id=email]")).sendKeys("tanmayghadge1996@gmail.com");
		 driver.findElement(By.xpath("//input[@type='password' and @id='password']")).sendKeys("123456789");
		 driver.findElement(By.xpath("//textarea[@class='form-control'][@id='address']")).sendKeys("at post kanersar,Tal.khed,Dist.pune,Maharashtra");
		 
//		 JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,450)", "");
		 
		 //radio buttons
		 List <WebElement>radioButtons=driver.findElements(By.xpath("//input[@type='radio' and @name='optionsRadios']"));
		 chooseRadioOption(radioButtons,"Male");
		 
		 //checkboxes days of week 
		 List <WebElement> weekDays=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		 chooseCheckBoxOption(weekDays,"all");
		 	 
		 //dropdown
		  WebElement drp=driver.findElement(By.cssSelector("select.custom-select"));
		  chooseDropDownOption(drp,"Greece"); 
		  
		 //radio buttons for years of experience
		  List <WebElement> radioButtons2 =driver.findElements(By.xpath("//div[@class='custom-control custom-radio']/label"));
		  chooseCheckBoxOption(radioButtons2,"1 year","3 years");
		  		  
		 //checkboxes for frameworks used
		  List <WebElement> checkBoxes2 =driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox']/label"));
		  chooseCheckBoxOption(checkBoxes2,"Serenity BDD","Selenium Webdriver","Cucumber","TestNG");
		  Thread.sleep(5000);
	}
}

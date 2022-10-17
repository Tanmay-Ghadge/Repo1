package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons2 
{
	public static void chooseOption(List <WebElement> list,String chosenOption)
	{
		for(WebElement option:list)
		{
	     String options=option.getText();
	     
	     if( options.equals(chosenOption))
	     { 	 
		  if(option.isDisplayed())
		  {
			  System.out.println(options+" is displayed");
			  if(option.isEnabled())
			  {
				  System.out.println(options+" is enabled");
				  if(option.isSelected())
				  {
					 if( options.equals(chosenOption))
					 {
						 option.click(); 
						 System.out.println(options+" is selected");
						 break;
					 }
				  }
				  else
					 {
					  System.out.println("Option is not selected");
					  
						 option.click(); 
						 System.out.println(options+" is selected");
						 break;
					 }
				  {
					 
				  }
			  }
			  else
			  {
				  System.out.println("option is not enabled");
			  }
		  }
		  else
		  {
			  System.out.println("option is not displayed");
		  }
		} 
		}
	}
	

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		
		System.out.println(driver.findElement(By.id("Basicmarkup")).getText());	
	    List <WebElement> basicMarkup =driver.findElements(By.xpath("//div[@role='main']/div[1]/form/div/label"));
	    chooseOption(basicMarkup,"Two");
	    System.out.println("--------------------------");
	    
	    
	   
	    System.out.println(driver.findElement(By.id("Verticalgroup")).getText()); 
	    List <WebElement> verticalGroup =driver.findElements(By.xpath("//div[@role='main']/div[3]/form/fieldset/div[2]/div/label"));
	    chooseOption(verticalGroup,"One");
	    System.out.println("--------------------------");
	    
	    
	    System.out.println(driver.findElement(By.id("Horizontalgroup")).getText());	
	    List <WebElement> horizontalGroup =driver.findElements(By.xpath("//div[@role='main']/div[5]/form/fieldset/div[2]/div"));
	    chooseOption(horizontalGroup,"Three");
	    System.out.println("--------------------------");
	    
	    
	    System.out.println(driver.findElement(By.id("Minisize")).getText());	
	    List <WebElement> miniSize =driver.findElements(By.xpath("//div[@role='main']/div[7]/form/fieldset/div[2]/div"));
	    chooseOption(miniSize,"Three");
	    System.out.println("--------------------------");
	    
	    System.out.println(driver.findElement(By.id("Iconposition")).getText());	
	    List <WebElement> iconposition =driver.findElements(By.xpath("//div[@role='main']/div[9]/form/fieldset/div[2]/div"));
	    chooseOption(iconposition,"Three");
	    System.out.println("--------------------------");
	    
	    System.out.println(driver.findElement(By.id("Theme")).getText());	
	    List <WebElement> theme =driver.findElements(By.xpath("//div[@role='main']/div[11]/form/fieldset/div[2]/div"));
	    chooseOption(theme,"Three");
	    System.out.println("--------------------------");
	    
	    
	    System.out.println(driver.findElement(By.id("Disabled")).getText());	
	    List <WebElement> disabled =driver.findElements(By.cssSelector("input[disabled=disabled]"));
	    chooseOption(disabled,"Two");
	    System.out.println("--------------------------");
	    
	    
	    System.out.println(driver.findElement(By.id("Enhanced")).getText());	
	    List <WebElement> enhanced =driver.findElements(By.xpath("//div[@role='main']/div[15]/div/label"));
	    chooseOption(enhanced,"I agree");
	    System.out.println("--------------------------");
	    
	   
	  //  driver.quit();
	
	}

}

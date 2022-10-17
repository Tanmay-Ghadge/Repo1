package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 
{
    public static void main(String[] args) 
    {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://udyamregister.org/");
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,100)","");
	 
	WebElement stateDropdownLocation=driver.findElement(By.id("office-state"));
	WebElement districtDropdownLocation=driver.findElement(By.id("office-district"));
	WebElement socialCategoryDropdownLocation=driver.findElement(By.cssSelector("select[name=social_category]"));
	WebElement orgTypeDropdownLocation=driver.findElement(By.cssSelector("select.form-control[name=type_of_organisation]"));
	
    Select statedropdown=new Select(stateDropdownLocation);
    statedropdown.selectByIndex(22);
    
    Select districtropdown=new Select(districtDropdownLocation);
    districtropdown.selectByIndex(25);
    
    Select socialCategorydropdown=new Select(districtDropdownLocation);
    socialCategorydropdown.selectByIndex(2);
    
    Select orgTypedropdown=new Select(districtDropdownLocation);
    orgTypedropdown.selectByVisibleText("Limited Liability Partnership");
    
    
    
    
    
    
    	
	}
}

 package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.uitestpractice.com/Students/Select");
		 driver.findElement(By.id("dropdownMenu1")).click();
	     List <WebElement> ul=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));//findElements
	     // xpath should be written upto li
	     for(WebElement allOption:ul)
	     {
	    	if(allOption.getText().equals("India"))
	    	{
	    		allOption.click();
	    		System.out.println("It clicked");
	    		break;
	    	}
	    	
	     }
	    
	//driver.quit();
		

	}

}

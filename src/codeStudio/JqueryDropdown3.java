package codeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown3 
{

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course//chromedriver.exe");	
     
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.jqueryscript.net/demo/multi-select-tree/");
	 
	WebElement locationDrp=driver.findElement(By.xpath("//div[@class='container']/span[1]"));
	locationDrp.click();
	
    List <WebElement> list=	driver.findElements(By.xpath("//div[@class='container']/div[1]/ul/li/ul/li/label"));
    System.out.println("Number of Options available in this dropdown="+list.size());
  List <WebElement> ne =driver.findElements(By.xpath("/html/body/div[2]/div[1]/ul/li/ul/li/label")); 
   // driver.findElement(By.xpath("//div[@class='container']/div[1]/ul/li/ul/li")).click();
 
    for (WebElement allOptions : ne) 
    {
    
    	if(allOptions.getAttribute("textContent").equals("Idaho"))
    	{
    		allOptions.click();
    		break;
    	}
    	
 
	 
    }
    System.out.println("------------------");
	//driver.quit();
	}

}

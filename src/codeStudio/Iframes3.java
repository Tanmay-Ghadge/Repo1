package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 List <WebElement> allFrames=driver.findElements(By.tagName("iframe"));
		 System.out.println("all iframes in a page-"+allFrames.size());
		 
		 //textbox which is on the main webpage
		WebElement textBox= driver.findElement(By.xpath("//input[@id='name']"));
		textBox.sendKeys("1");
		
		//switching to first frame
		driver.switchTo().frame("frm1");
	    List <WebElement> frames=driver.findElements(By.tagName("iframe"));
	    System.out.println(frames.size());
		
	    WebElement dropdownLocation =driver.findElement(By.xpath("course"));
	    
	    Select dropdown=new Select(dropdownLocation);
	    dropdown.selectByVisibleText("Java");
	    
		 

	}

}

package codeStudio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://jqueryui.com/tooltip/");
	   //https://ads.google.com/intl/en_in/getstarted/pricing/?subid=in-en-ha-awa-sk-c-s00!o3~Cj0KCQjwuuKXBhCRARIsAC-gM0ijMZqITu-vEFVQTUM-P9iv_126pWPHXiB4OwaVXUEKhopxsjr3_ecaAvXAEALw_wcB~137106994202~kwd-970540515~16869585356~592430221840&gclid=Cj0KCQjwuuKXBhCRARIsAC-gM0ijMZqITu-vEFVQTUM-P9iv_126pWPHXiB4OwaVXUEKhopxsjr3_ecaAvXAEALw_wcB&gclsrc=aw.ds
		 
		List<WebElement> anchertags= driver.findElements(By.tagName("a"));
		anchertags.addAll(driver.findElements(By.tagName("input")));
		
		Actions action=new Actions(driver);
		
		int tooltips=0;
		for (WebElement webElement : anchertags)
		{
			action.moveToElement(webElement);
			String title=webElement.getAttribute("title");
			if(title!=null && !title.isBlank())
			{
				System.out.println(title);
				tooltips++;
			}
			
		}
		
	
		driver.switchTo().frame(0);
		List<WebElement> iframeanchertag= driver.findElements(By.tagName("a"));
		iframeanchertag.addAll(driver.findElements(By.tagName("input")));
		
		for (WebElement webElement : iframeanchertag)
		{
			action.moveToElement(webElement);
			String title=webElement.getAttribute("title");
			if(title!=null && !title.isBlank())
			{
				System.out.println(title);
				tooltips++;
			}
			
		}
		System.out.println("total number of tool tips in a page-->"+tooltips);
		
		
		
		 driver.quit();
	}
	
	
	

}

package codeStudio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		System.out.println("page title:"+driver.getTitle());
		String parentPage=driver.getWindowHandle();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.website.com/?source=SC&country=IN");
		System.out.println("page title 2"+driver.getTitle());
		//String a=driver.findElement(By.partialLinkText("Create My Free Website")).getText();
		
		Set <String> windowhandles=driver.getWindowHandles();
		
		List <String> handles=new ArrayList(windowhandles);
		
		driver.switchTo().window(handles.get(0));
		
		driver.close();
		
		driver.switchTo().window(parentPage);
		System.out.println(driver.getTitle());
		
		
		//System.out.println(a);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavacsriptExecutor 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\Drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://automationintesting.online/");
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 
	 js.executeScript("window.scrollBy(0,350)","");
	 
	 //enter text in a textbox
	 js.executeScript("document.getElementById('name').value='tanmay';"); 
	 js.executeScript("document.getElementById('email').value='tg@gmail.com';");
	 js.executeScript("document.getElementById('phone').value='6489756123';");
	 js.executeScript("document.getElementById('subject').value='automation practice';");
	 
	 WebElement element=driver.findElement(By.id("submitContact"));
	 
	 // clicking on a element
	 //js.executeScript("argument[0].click();",element);
	 
	 //refresh
	 js.executeScript("history.go(0)");
	 
	 //get domain name
	 String domain =js.executeScript("return document.domain;").toString();
	 System.out.println("domain name--k"+domain);
	 
	 //get page title
	 String title=js.executeScript("return document.title").toString();
	 System.out.println("title--"+title);
	 
	 //get url
	 String url=js.executeScript("return document.URL").toString();
	 System.out.println("URL--"+url);
		
	 //get page width
	 String pageWidth=js.executeScript("return window.innerWidth;").toString();
	 System.out.println("page width--"+pageWidth);
	 
	 //get page height
	 String pageHeight=js.executeScript("return window.innerHeight;").toString();
	 System.out.println("page height--"+pageHeight);
	 
	 //zoom
	 js.executeScript("document.body.style.zoom='50%'");
	 
	 //scroll till end
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 Thread.sleep(5000);
	 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	 
		
		
		
		
		
	}

}

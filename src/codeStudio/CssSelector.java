package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector
{

	public static void main(String[] args)
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
      
	  //Launching ChromeDriver
	  WebDriver driver=new ChromeDriver();
	  
	  //Opening url swaglabs
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  System.out.println("login page title="+title);
	  
	  //Locate userid by tag#id
	  driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	  
	  //locate password by tag and attribute
	  driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
	  
	  //locate sign in by tag.classname
	  driver.findElement(By.cssSelector("input.submit-button")).click();
	  
	  // adding backpack to cart using tag,class and attribute
	  driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack")).click();
	  
	  String windowHandle= driver.getWindowHandle();
	  System.out.println("Window handle="+windowHandle);
	  String title2=driver.getTitle();
	  System.out.println("Title of the page after logging in="+title2);
	  
	  // adding backpack to cart using tag,class and attribute
	  driver.findElement(By.cssSelector("button.btn[id=add-to-cart-sauce-labs-bike-light")).click();
	  
	  driver.findElement(By.cssSelector("button.btn[data-test=add-to-cart-sauce-labs-bolt-t-shirt")).click();
	    
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,250)", "");
	  
	  driver.findElement(By.cssSelector("button[data-test=add-to-cart-sauce-labs-fleece-jacket]")).click();
	  
	  driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-onesie")).click();
	  
	  driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	  
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	  js1.executeScript("window.scrollBy(0,-250)", "");
	  
	  driver.findElement(By.cssSelector("a.shopping_cart_link"));
	  String windowHandle2=driver.getWindowHandle();
	  System.out.println("Window handle of page 3="+windowHandle2);
	  
	  driver.switchTo().window(windowHandle);
	  
	  driver.switchTo().window(windowHandle2);//should lead me to add to cart page
	  
	  System.out.println("It did not lead me to add to cart page,hence windowHandle doesnt always work");
	  
	  //locating webelement by substring-ends with
	  //tag[attribute$=substring]----ends with
	  driver.findElement(By.cssSelector("button[name$=light")).click();
	  driver.findElement(By.cssSelector("button[name$=bolt-t-shirt")).click();
	  
	  //tag[attribute*=substring]-----contains
	  driver.findElement(By.cssSelector("button[data-test*=sauce-labs-backpack")).click();
	  driver.findElement(By.cssSelector("button[data-test*=fleece-jacket")).click();
	  
	
	  js1.executeScript("window.scrollBy(0,250)", "");
	  
	  try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  
	  //css selector with starts with substring didnt work.need to work on more examples
	  driver.findElement(By.cssSelector("button[name^=add-to-cart-sauce-labs-onesie")).click();
	  //driver.findElement(By.cssSelector("button[data-test^=add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	  //driver.quit();
	  
	  
	  
	}

}

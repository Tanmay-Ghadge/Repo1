package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// opening swaglab
		driver.navigate().to("https://www.saucedemo.com/");
		
		//locate username with single attribute xpath
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("performance_glitch_user");
		
		//locate password with two attributes
		driver.findElement(By.xpath("//*[@id=\"password\"]"))
		.sendKeys("secret_sauce");
		
		//locate login with two attributes
		driver.findElement(By.xpath("//*[@type='submit'][@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack'][@name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light'][@id='add-to-cart-sauce-labs-bike-light']")).click();
	    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt'][@name='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
	
	    //locate element by xpath with and expression
	    driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-fleece-jacket' and @id='add-to-cart-sauce-labs-fleece-jacket']")).click();
	    
	    //scrolling down
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)","");
	    
	    //locate element by xpath with or expression
	    driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie' or id='add-to-cart-sauce-labs-onesie']")).click();
	    driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)' or @name='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
	    
	   //locate element by xpath with contains method
	    js.executeScript("window.scrollBy(0,-300)","");
	    driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]")).click();
	    js.executeScript("window.scrollBy(0,500)","");
	    driver.findElement(By.xpath("//button[contains(@id,'checkout')]")).click();
	    
	    Thread.sleep(5000);
	    System.out.println("----------------");
	    driver.findElement(By.xpath("//input[@placeholder='First Name'][@data-test='firstName']")).sendKeys("xpath");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name' and @data-test='lastName']")).sendKeys("practice");
	    driver.findElement(By.xpath("//input[@id='postal-code' or @name='postalCode']")).sendKeys("787845");
	    //js.executeScript("window.scrollBy(0,200)","");
	    System.out.println("----------------");
	    driver.findElement(By.xpath("//input[contains(@class,'submit-button btn btn_primary cart_button')]")).click();
	    js.executeScript("window.scrollBy(0,680)","");
	    
	    //finishing by using xpath starts-with method
	    
	    driver.findElement(By.xpath("//button[starts-with(@class,'btn btn_action btn_medium cart')]")).click();
	    driver.findElement(By.xpath("//button[starts-with(@data-test,'back-to-prod')]")).click();
	    
	    //locating by using xpath with text() method
	    driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
	    String a=driver.findElement(By.xpath("//button[@id='back-to-products']")).getText();
	   System.out.println(a);
	    //  driver.quit();
	}

}

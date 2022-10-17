package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\chromedriver.exe");
	   
	   //Launch Chrome Browser
	   WebDriver driver=new ChromeDriver();
	   
	   //maximise window
	   driver.manage().window().maximize();
	   
	   //go to Website
	   driver.get("https://www.saucedemo.com/");
	   
	   // Print title of first page
	   String pageTitle1=driver.getTitle();
	   System.out.println("First page title: "+pageTitle1);
	   
	   //write user id
	   driver.findElement(By.name("user-name")).sendKeys("standard_user");
	   
	   //write password
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   
	   //Click on log in button
	   driver.findElement(By.className("submit-button")).click();
	   
	   // compare title of the second page with first page title
	   String pageTitle2=driver.getTitle();
	   System.out.println("Second Page title: "+pageTitle2);

	   // confirm we have shifted from one page to next page
		if (pageTitle1==pageTitle2) 
		{
         System.out.println("Log in Failed");//some websites have same page titles in multiple pages
		} //hence not necessary to have diffrent page title in each webpage
		else 
		{
           System.out.println("successfully Logged in");
		}
	   
		// Add fleece-jacket to cart
		
		driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
	    driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	   
	    String text=driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).getText();
	    
	    //confirm added to cart successfully or not
	    if (text.equals("REMOVE")==true)
	    {
		System.out.println("fleece-jacket Added to cart successfully");	
		} 
	    else
		{
           System.out.println("Add to cart failed");
		}
	    
	    // Navigate back to previous page
	    driver.navigate().back();
	    
	    //Add backpack to cart 
	    driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	    
	    String text2=driver.findElement(By.id("remove-sauce-labs-backpack")).getText();
	    
	    // confirm backpack added to cart
	    if (text2.equals("REMOVE")!=false)
	    {
		 System.out.println("Backpack Added to cart successfully");
		}
	    else
	    {
          System.out.println("Add to cart failed");
		}
	    
	// add Sauce Labs Bike Light to cart
	  driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	  String text3=driver.findElement(By.id("remove-sauce-labs-bike-light")).getText();
	  
	  // confirm
	  System.out.println(text3);
		if ((text3.equals("REMOVE"))==true)
		{
          System.out.println("Bike Light added to cart sucessfully");
		} 
		else 
		{
         System.out.println("Add to cart failed");
		}
		
		//how many products has sauce word in it
		List<WebElement> a =driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Count of Sauce Products:"+a.size());
		
		//Quit all windows
		driver.quit();
		
		
		
	
		
		
	    
	    
	    
	    
   }
}

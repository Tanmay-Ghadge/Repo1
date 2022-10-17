package locate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating 
{
    public static void main(String[] args)
    {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\Drivers\\chromedriver.exe");
        
      WebDriver drive=new ChromeDriver();
      drive.manage().window().maximize();
      
      drive.get("http://automationpractice.com/index.php");
      drive.findElement(By.name("search_query")).sendKeys("Shirts");
      drive.findElement(By.name("submit_search")).click();
      drive.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/a/img")).click();
    //  drive.findElement(By.xpath("//*[@id=\"thumb_7\"]")).click();
      JavascriptExecutor js = (JavascriptExecutor) drive;
      js.executeScript("window.scrollBy(0,350)", "");
      //drive.findElement(By.cssSelector("button.exclusive")).click();
      drive.findElement(By.linkText("Proceed to checkout")).click();
      
      
    	
    	
    }
    
}

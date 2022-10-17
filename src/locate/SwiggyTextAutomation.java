package locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTextAutomation 
{
	int a=10;
	public static String actualText1;
	String actualText2;
	String actualText3;
	String actualText4;
	String actualText5;
	String actualText6;
  
	String m1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		return SwiggyTextAutomation.actualText1=driver.findElement(By.className("sZsUd")).getText();
		//System.out.println(actualText1);
	}
	
	
	public static void main(String[] args) 
	{
		SwiggyTextAutomation a=new SwiggyTextAutomation();
		a.m1();
	  
	/*try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	
	 * 
	actualText2=driver.findElement(By.className("sZsUd")).getText();
	System.out.println(actualText2);
	try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	String actualText3=driver.findElement(By.className("sZsUd")).getText();
	System.out.println(actualText3);
	try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	
	String actualText4=driver.findElement(By.className("sZsUd")).getText();
	System.out.println(actualText4);
	try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	
	String actualText5=driver.findElement(By.className("sZsUd")).getText();
	System.out.println(actualText5);
	try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	
	String actualText6=driver.findElement(By.className("sZsUd")).getText();
	System.out.println(actualText6);
	try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	
	String actualText7=driver.findElement(By.className("sZsUd")).getText();
	
	if(actualText7.equals(actualText1)==true)
	{
		System.out.println("-------------all texts captured--------------");
	}
	else
	{
	System.out.println(actualText7);
	}
	
	try 
	{
		Thread.sleep(4000);
	} catch (InterruptedException e) 
	{
		
	}
	*/
	

	}

}

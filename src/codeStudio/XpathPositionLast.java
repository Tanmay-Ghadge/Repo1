package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPositionLast {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// opening swaglab
		driver.navigate().to("http://only-testing-blog.blogspot.com/2014/05/form.html");
		
		driver.findElement(By.xpath("//input[@type='text'][position()=1]")).sendKeys("tanmay1");
		driver.findElement(By.xpath("//input[@type='text'][position()=2]")).sendKeys("tanmay2");
		driver.findElement(By.xpath("//input[@type='text'][position()=3]")).sendKeys("tanmay3");
		driver.findElement(By.xpath("//input[@type='text'][position()=4]")).sendKeys("tanmay4");
		driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("tanmay5");
	
	
	
	}

}

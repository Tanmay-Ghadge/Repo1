package locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\Drivers\\chromedriver.exe");
        
	      WebDriver drive1=new ChromeDriver();
	      drive1.manage().window().maximize();
	      drive1.get("http://demo.automationtesting.in/Register.html");
	      drive1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Tanmay");
	      drive1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Ghadge");
	      drive1.findElement(By.tagName("textarea")).sendKeys("At post kanersar Tal.Khed Dist.Pune");
	      drive1.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("tanmayghadge54");
	      
	      
	      
	      
	      
	      //drive1.close();
		

	}

}

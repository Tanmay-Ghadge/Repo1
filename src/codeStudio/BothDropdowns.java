package codeStudio;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//https://mprojgar.gov.in/JobSeekerRegistration
public class BothDropdowns 
{
	public static void m1(WebElement location,String value)
	{
		Select dropdown=new Select(location);
		
		List <WebElement> listOfOptions=dropdown.getOptions();
		
		Iterator <WebElement> it=listOfOptions.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		
		
		
		
		
		
		/*for(WebElement allOptions:listOfOptions)
		{
			if(allOptions.getText().equals(value))
			{
				allOptions.click();
				break;
			}
			System.out.println(allOptions.getText());//you cannot print List directly
		}*/
		
		
	}

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
       
		driver.get("https://chennaicorporation.gov.in/gcc/online-services/birth-certificate/");
		
		//normal approch
		
		/*Select dropdown1=new Select(driver.findElement(By.id("sel_day")));
		dropdown1.selectByIndex(31);
		
		Select dropdown2=new Select(driver.findElement(By.id("sel_month")));
		dropdown2.selectByValue("01");
		
		Select dropdown3=new Select(driver.findElement(By.id("sel_year")));
		dropdown3.selectByVisibleText("2018");*/ 
		
		//Sdet techie aproch
	    WebElement drp1=driver.findElement(By.id("sel_day"));
	    m1(drp1,"31");
	    WebElement drp2=driver.findElement(By.id("sel_month"));
	    //m1(drp2,"January");
	    WebElement drp3=driver.findElement(By.id("sel_year"));
	  //  m1(drp3,"2022");
		//31-january-2022
		driver.quit();
		
		

	}

}

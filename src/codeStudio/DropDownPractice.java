package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.navigate().to("https://udyamregister.org/");
		  
		 WebElement element= driver.findElement(By.id("office-state"));
		  
		  Select dropdown=new Select(element);
		  
		  //dropdown.selectByIndex(1);
		  dropdown.selectByValue("Uttar_Pradesh");
		  //dropdown.selectByVisibleText("34. TRIPURA ");// does not work because of the hindi language used 
		  
		  if(dropdown.isMultiple())
		  {
			  System.out.println("this dropdown allows to select multiple options ");
		  }
		  else
		  {
			  System.out.println("this dropdown does not allow to select multiple options ");
		  }
		  
		  List<WebElement> allOptions=dropdown.getOptions();
		  
		  for( WebElement e :allOptions)
		  {
			  String a =e.getText();
			  System.out.println(a);
		  }
		  
	      int a=allOptions.size();
		  System.out.println(a);
		  

	}

}

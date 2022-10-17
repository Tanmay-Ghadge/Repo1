package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.opencart.com/index.php?route=account/register");
	  
	  //storing located dropdown element into WebElement variable element
	  WebElement element=driver.findElement(By.id("input-country"));
	  
	  //creating object of Select class and passing element as a parameter in constructor
	  Select dropdown=new Select(element);
	  
	  // dropdown.selectByVisibleText("East Timor");
	  // dropdown.selectByValue("91");
	 // dropdown.selectByIndex(1);
	  
	  //check whether the dropdown is allowing to select multiple options
	  if(dropdown.isMultiple()==true)
	  {
		  System.out.println("dropdown is allowing to select multiple options");
	  }
	  else
	  {
		  System.out.println("dropdown is not allowing to select multiple options");
	  }
	   
	  //print all options
	  List <WebElement> allOptions=dropdown.getOptions();//always import list from java.util package
	  //System.out.println(allOptions); //we cannot print all elements in a List like this
	  
	  for(WebElement e:allOptions)
	  {
		  String element1=e.getText();
		  System.out.println(element1);
		  
	  }
	  
	  //finding how many total options are available in this dropdown
	 int numberOfAllOptions=allOptions.size();
	 System.out.println("Number of all options available in this dropdown are:="+numberOfAllOptions);
	  
	 //selecting a options from dropdown without using Select class method
	 
	for(WebElement e:allOptions)
	  {
		 if( e.getText().equals("Trinidad and Tobago"))
		 {
		    e.click();
		    break;
		 }
		  
		  
	  }
	  
	  
	  
	  //driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}

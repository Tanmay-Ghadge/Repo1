package locate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jujv 
{
     public static void main(String[] args)
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\Drivers\\chromedriver.exe");
    	 
    	 WebDriver driver4=new ChromeDriver();
    	 
    	/* driver4.get("https://www.myntra.com/");
    	 driver4.manage().window().maximize();
    	 int a=driver4.findElements(By.className("slick-slide")).size();
    	 
    	 System.out.println("No of Slides:"+a);*/
    	
      //   int b=driver4.findElements(By.tagName("a")).size();
      //   System.out.println("Number of weblinks:"+b);
        
         //driver4.navigate().to("https://www.flipkart.com/");
        // driver4.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    	 driver4.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=EAIaIQobChMI4NO92Img-AIV-Z1LBR0z7we-EAAYASAAEgLaqvD_BwE");
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	 
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	 System.out.println( driver4.findElement(By.className("sZsUd")).getText());
    	 try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	 driver4.quit();
    	 
     }
}
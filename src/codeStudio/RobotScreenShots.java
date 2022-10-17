package codeStudio;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotScreenShots 
{

	public static void main(String[] args) throws AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tusha\\Documents\\learning\\java full course\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.wix.com/");
		 
		 Robot robotMama=new Robot();
		 
         // scrplling up and down
		 
		 robotMama.mouseWheel(5000);
		 robotMama.delay(2000);
		 robotMama.mouseWheel(-500);
		 
		 //screenshot of specific diamensions
		 Rectangle rectangle=new Rectangle(10,20,1000,400);
		 
		 BufferedImage srcImage= robotMama.createScreenCapture(rectangle);
		 ImageIO.write(srcImage,"PNG",new File("C:\\Users\\tusha\\Documents\\learning\\java full course\\New\\ScreenShots\\robot1.png"));
		
		// screenshot of full screen
		 Dimension diamension=Toolkit.getDefaultToolkit().getScreenSize();
		 
		 Rectangle fullScreen=new Rectangle(diamension);
		 
		 BufferedImage fullscreen=robotMama.createScreenCapture(fullScreen);
		 
		 String screenshotPath=System.getProperty("user.dir")+"//ScreenShots//robot2.png";
		 //ImageIO.write(fullscreen,"PNG",new File("./ScreenShots/fullScreen2.png"));
		 ImageIO.write(fullscreen,"PNG",new File(screenshotPath));
		
		
		
		
	//	driver.quit();
		 
		 
		 
		 
		 
	}

}

package codeStudio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotPainting 
{
	public static void main(String[] args) throws AWTException 
	{
		Robot robot=new Robot();
		
		//clicked on windows
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.delay(1500);
		
		// typed p then a to find paint
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.delay(1500);
		
		// search result came paint hence clicked on enter-opened paint
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		robot.delay(1500);
	
		
		//rectangle option location
		robot.mouseMove(410,55);
		
		//clicked on rectangle
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.mouseMove(50,170);//starting point of rectangle
		robot.delay(1500);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(1450,700);//rectangle width and height
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1500);
	
		robot.mouseMove(375,55);// curve location
		
		//moving to line 
		
		robot.mouseMove(355,60);
		robot.delay(1500);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//drawing middle line
		
		robot.mouseMove(50,450);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(1450,450);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1500);
		
		//selcting pensil
		robot.mouseMove(230,75);// pensil location
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//drawing mountains
		robot.delay(1500);
		robot.mouseMove(50,450);//starting point
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(100,420);//point 1
		robot.delay(500);
		robot.mouseMove(200,330);// point 2
		robot.delay(500);
		//robot.mouseMove(310,400);// point 3
		robot.delay(500);
		robot.mouseMove(450,420);// point 4
		robot.delay(500);
		
		robot.mouseMove(650,445);// point 4
		robot.delay(500);
		
		
		robot.mouseMove(700,410);// point 5
		robot.delay(500);
		robot.mouseMove(850,375);// point 6
		robot.delay(500);
		robot.mouseMove(980,380);// point 6
		robot.delay(500);
		robot.mouseMove(1130,330);// point 6
		robot.delay(500);
		robot.mouseMove(1270,410);// point 6
		robot.delay(500);
		robot.mouseMove(1450,450);// last point
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//selecting paint
		robot.mouseMove(250,75);// paint location
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(500);
		robot.mouseMove(450,430);// drop colour
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//move to circle
		robot.mouseMove(390,55);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.mouseMove(650,335);// point 4
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(550,235);// point 4
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//selecting paint container
		robot.mouseMove(250,75);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(500);
		
		//selecting paint colour for sun
		robot.mouseMove(800,55);//yellow colour
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(500);
		
		robot.mouseMove(600,280);// point 4
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//dropping sun's colour
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1500);
		
		// selecting sky colour
		robot.mouseMove(800,75);//sky colour
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.mouseMove(60,200);// point 4
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//dropping sun blue colour
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		// selecting water colour
		robot.mouseMove(870,75);//blue colour
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.mouseMove(580,600);// point 4
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//dropping blue colour
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}

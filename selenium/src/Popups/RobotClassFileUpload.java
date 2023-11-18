package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassFileUpload {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(2000);
	    
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_A);
	    
	    robo.keyPress(KeyEvent.VK_P);
	    robo.keyRelease(KeyEvent.VK_P);
	    
	    robo.keyPress(KeyEvent.VK_P);
	    robo.keyRelease(KeyEvent.VK_P);
	    
	    robo.keyPress(KeyEvent.VK_U);
	    robo.keyRelease(KeyEvent.VK_U);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	
	}

}

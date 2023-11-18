package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandles {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.id("newWindowBtn")).click();
		//switch to the new tab
		String currentab=driver.getWindowHandle();
		for(String tab:driver.getWindowHandles()) {
			if(tab.equals(currentab)) {
				driver.switchTo().window(tab);
				break;
			}
		}
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.switchTo().window(currentab);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
}
}

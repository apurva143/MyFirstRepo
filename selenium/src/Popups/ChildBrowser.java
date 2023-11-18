package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	Thread.sleep(3000);
	driver.findElement(By.id("newWindowBtn")).click();
	
	Set<String> allWindowIds = driver.getWindowHandles();
	String parentId = driver.getWindowHandle();
	String expectedTitle="Basic Controls";
	for(String id:allWindowIds) {
		driver.switchTo().window(expectedTitle);
		if(driver.getTitle().contains(expectedTitle)) {
			driver.manage().window().maximize();
		}
	}
}
}

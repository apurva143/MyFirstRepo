package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingonetab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> allwinId = driver.getWindowHandles();
	String parentId = driver.getWindowHandle();
	String expectedTitle="AlertsDemo";
	
	for( String id:allwinId) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains(expectedTitle)) {
			driver.close();
		}
		else {
			driver.manage().window().maximize();
		}
	}
	}

}

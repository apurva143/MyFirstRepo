package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadWithSendkeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		driver.findElement(By.id("photo-upload")).sendKeys("C:\\Users\\Dood vali\\Pictures\\sai baba.jpg");
	}		
				

}

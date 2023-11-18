package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingCheckbox {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/alert/alertCheck");
		driver.findElement(By.xpath("//button[text()='Open alert']")).click();
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='I agree to the terms']")).click();
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='close']")).click();
	}
}

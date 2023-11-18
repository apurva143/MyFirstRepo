package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("yes");
		//alert.dismiss();
		Thread.sleep(2000);
		alert.accept();
	}
		

}

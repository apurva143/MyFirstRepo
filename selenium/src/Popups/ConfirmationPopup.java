package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/alert/confirm");
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		//alert.dismiss();
		System.out.println(alert.getText());
	}
		

}

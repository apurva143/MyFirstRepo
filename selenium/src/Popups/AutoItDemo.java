package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
//		Runtime.getRuntime().exec("./AutoIt/AutoitDemo.exe");
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		Runtime.getRuntime().exec("./AutoIt/FileUpload.exe");

	}
				

}

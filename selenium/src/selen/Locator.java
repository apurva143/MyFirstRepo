package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("username")).sendKeys("im selenium");
	driver.findElement(By.name("password")).sendKeys("im java");
	driver.findElement(By.className("cpassword")).sendKeys("im also java");
	
	

}
}

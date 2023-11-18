package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggyregxpath {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9490024749");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("apurvakasetty1347@gmail.com");
		Thread.sleep(1000);
		//driver.findElement(By.className("null");
	}
}

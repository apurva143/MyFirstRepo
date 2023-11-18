package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitmethods {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.id("small-searchterms"));
		element.sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		driver.findElement(By.xpath("//input[@id='As']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).submit();
	}
}

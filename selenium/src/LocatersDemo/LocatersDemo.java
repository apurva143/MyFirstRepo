package LocatersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dood%20vali/Documents/.html");
		driver.findElement(By.id("username")).sendKeys("I am selenium");
		

	}

}

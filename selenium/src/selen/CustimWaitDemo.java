package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustimWaitDemo {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		for(int i=0;i<100;i++) {
			try {
				driver.findElement(By.name("username")).sendKeys("Apurva");
				break;
			}catch(Exception e) {
				System.out.println(i);
			}
			}
		}

}

package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelecteMethods {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement element=driver.findElement(By.id("RememberMe"));
		System.out.println("selected status:"+element.isSelected());
		element.click();
		System.out.println("selected status:"+element.isSelected());
	}

}

package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributenameandtagname {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		WebElement element=driver.findElement(By.name("firstname"));
		System.out.println(element.getTagName());
		System.out.println(element.getAttribute("class"));
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getAttribute("value"));
		System.out.println("*************");
		element.sendKeys("abc124");
		System.out.println(element.getAttribute("value"));
		System.out.println("******************");
		driver.findElement(By.linkText("Already have an account?"));
		System.out.println(element.getAttribute("herf"));
		
	}
		
}

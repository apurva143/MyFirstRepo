package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatowebelement {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
	WebDriver driver1=new ChromeDriver();

	driver1.manage().window().maximize();
	driver1.get("https://www.zomato.com/partner-with-us");
	WebElement element=driver1.findElement(By.className("sc-1kx5g6g-3"));
	System.out.println(element.getTagName());
	System.out.println(element.getText());
	System.out.println(element.getAttribute("class"));
	System.out.println(element.getCssValue("display"));
	System.out.println(element.getCssValue("transition"));
	
	System.out.println("****************************");
	WebElement element1=driver1.findElement(By.className("sc-1kx5g6g-3"));
	element1.click();
	driver1.navigate().refresh();
	driver1.findElement(By.linkText("Advertise")).click();

}
}

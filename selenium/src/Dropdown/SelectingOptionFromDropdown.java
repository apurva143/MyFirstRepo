package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingOptionFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Apoorva/dropdown.html");
		WebElement dropdown=driver.findElement(By.id("single"));
		Select select=new Select(dropdown);
		select.selectByValue("3");
		Thread.sleep(2000);
		select.selectByVisibleText("sql");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		//select.deselectByIndex(3);
		//Thread.sleep(2000);
		//select.deselectByValue("1");
		//Thread.sleep(2000);
		//select.deselectByVisibleText("manual");
		select.deselectAll();
		
	}
		

}

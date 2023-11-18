package actionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrationOfMouseHovering {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Actions act=new Actions(driver);
WebElement element=driver.findElement(By.xpath("//span[text()='Fashion']"));
act.moveToElement(element).perform();
	}
}

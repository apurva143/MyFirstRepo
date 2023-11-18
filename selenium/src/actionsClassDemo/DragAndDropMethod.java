package actionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://demoapps.qspiders.com/dragDrop");
		//WebElement src = driver.findElement(By.xpath("//div[contains(text(),'Apple')]"));
		WebElement src1 = driver.findElement(By.xpath("//div[contains(text(),'Mango')]"));
		//WebElement destination = driver.findElement(By.xpath("//div[contains(@class,'h-8')]"));
		WebElement destination1 = driver.findElement(By.xpath("//div[contains(@class,'item  h-8')]"));
			Actions act=new Actions(driver);
			Actions act1=new Actions(driver);
			//act.dragAndDrop(src, destination1 ).perform();
			act.dragAndDrop(src1, destination1 ).perform();

}
}

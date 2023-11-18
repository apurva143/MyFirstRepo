package actionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demonistrationofmoveToElement {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			//****************myntra*********************//
			driver.get("https://www.myntra.com/");
			Actions act=new Actions(driver);
			WebElement element=driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
			act.moveToElement(element).perform();


			//***************qspidersapp********************//
			Thread.sleep(2000);
			driver.get("http://demoapps.qspiders.com/");
			driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
			driver.findElement(By.linkText("Keyboard")).click();

			Actions act2=new Actions(driver);
			WebElement element2=driver.findElement(By.xpath("//button[text()='Press Enter to Submit']"));
			act2.moveToElement(element2).perform();
			element2.click();
			Thread.sleep(3000);

			WebElement element3=driver.findElement(By.id("email"));
			act2.moveToElement(element3).perform();
			element3.sendKeys("apurvakasetty1347@gmail.com");//send the information on email text field
			Thread.sleep(3000);

			WebElement element4=driver.findElement(By.id("password"));
			act2.moveToElement(element4).perform();
			element4.sendKeys("apurva1347");//send the information on password text field
			Thread.sleep(3000);

			WebElement element5=driver.findElement(By.id("confirmPassword"));
			act2.moveToElement(element5).perform();
			element5.sendKeys("apurva1347");//send the information on cnfm password text field
			Thread.sleep(3000);

			element2.click();

			//****************ajio.shoppingapp***************//
			Thread.sleep(2000);
			driver.get("https://www.ajio.com/shop/womenswear?gclid=Cj0KCQjwhL6pBhDjARIsAGx8D5_dRdVx0mmH8wlTe1_PFnNuZzVFfjRmNmA2Md8J_tahfb5wYfL3sqsaAqerEALw_wcB");
			Actions act1=new Actions(driver);
			WebElement element1=driver.findElement(By.xpath("//a[text()='HOME AND KITCHEN']"));
			act1.moveToElement(element1).perform();
			Thread.sleep(1000);
			
			WebElement element6=driver.findElement(By.xpath("//a[text()='WOMEN']"));
			act1.moveToElement(element6).perform();
			Thread.sleep(1000);
			
			WebElement element7=driver.findElement(By.xpath("//a[text()='MEN']"));
			act1.moveToElement(element7).perform();
		}

	}



package selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Qspidersfullstillcomplitedallmethods {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://demoapps.qspiders.com/");
			
					driver.findElement(By.id("name")).sendKeys("Apurva");
					Thread.sleep(2000);
					driver.findElement(By.id("email")).sendKeys("apurvakasetty@gmail.com");
					Thread.sleep(2000);
					driver.findElement(By.id("password")).sendKeys("appu@123");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@type='submit']")).submit();
			
					driver.findElement(By.linkText("Button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='4']")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Link")).click();
					Thread.sleep(2000);
					driver.findElement(By.partialLinkText("Link in New Tab")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Web Table")).click();
					Thread.sleep(2000);
			
					driver.findElement(By.linkText("Favourite Products")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Dropdown")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Radio Button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@type='radio'])[8]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@type='submit']")).submit();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Selected")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Default")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Check Box")).click();
					driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//input[@type='submit']")).submit();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Selected")).click();
					driver.findElement(By.linkText("Default")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Toggle")).click();
					
					driver.findElement(By.xpath("(//span[contains(@class,'relative')])[2]")).click();
					Thread.sleep(2000);
					
				    driver.findElement(By.xpath("(//span[contains(@class,'relative')])[3]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//span[contains(@class,'relative')])[4]")).click();
			        driver.findElement(By.xpath("//button[contains(@class,'bg-orange-500')]")).click();
			        Thread.sleep(2000);
			       
			driver.findElement(By.linkText("image")).click();

			Thread.sleep(2000);
			WebElement element = driver.findElement(By.xpath("//img[@class='w-[60%] m-auto']"));
			System.out.println(element.getSize());//get the imp height width of the imp
			System.out.println(element.getRect());

			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Scroll']")).click();
			driver.findElement(By.xpath("//section[@class='poppins']")).click();

			WebElement element1 = driver.findElement(By.xpath("//div[contains(@class,'h-[400px]')]"));  
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("scrollBy(0,300)");
			js.executeScript("arguments[0].scrollIntoView(true)", element1);
			
			




		} 

	}



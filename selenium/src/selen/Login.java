package selen;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("text")).sendKeys("iam selenium");
	
}
}

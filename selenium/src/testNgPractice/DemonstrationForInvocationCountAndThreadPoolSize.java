package testNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemonstrationForInvocationCountAndThreadPoolSize {
	@Test(invocationCount=5,threadPoolSize=3)
	public void login()throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.quit();
	}

}

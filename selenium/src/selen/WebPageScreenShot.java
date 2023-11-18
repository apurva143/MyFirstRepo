package selen;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShot {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(2000);
		File photo=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./TakeScreenshot/instal.png");
		photo.renameTo(file);
	}
		
}

package selen;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshot {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile =ts.getScreenshotAs(OutputType.FILE);
		String presentDateAndTime=LocalDateTime.now().toString().replace(':', '-');
		FileHandler.copy(tempFile,new File("./errorshot/facebook"+presentDateAndTime+".jpg"));
	}
}

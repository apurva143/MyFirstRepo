package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseOrMaximizeBasedOnTitle {
	public static void main(String[]args)throws InterruptedException, IOException{
		String expectedTitle="your Expected Title";
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com//p/window-handles-practice.html");
        String CurrentTitle=driver.getTitle();
        if(CurrentTitle.equals(expectedTitle)) {
        	driver.manage().window().maximize();
        	Thread.sleep(2000);
        }else {
        	driver.close();
        }
        Thread.sleep(2000);
        driver.quit();
        }
        }


package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {
	public static void main(String[]args)throws InterruptedException, IOException{
	System.setProperty("webdriver.chrome.driver","./selenium/chromedriver");
	ChromeOptions option=new ChromeOptions();
	//to handle notification popup
	option.addArguments("--disable-notifications");
	//to open browser in incognito mode
	option.addArguments("--incogni");
	option.addArguments("start-maximized");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
}

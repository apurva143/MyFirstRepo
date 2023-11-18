package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAjwnOipBhBQEiwACyGLugEkyqjqo_x045d_ex6tSaVE7t1ydkhkE8yb9aPck-MwaGc9vyJ7VhoC6yMQAvD_BwE");
	}

}

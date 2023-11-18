package selen;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		
		
	}
}

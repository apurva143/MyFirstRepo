package Popups;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	public static void main(String[]args)throws InterruptedException, IOException{
		//System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/browser");
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		Set<String>allwindowid=driver.getWindowHandles();
		String parentid=driver.getWindowHandle();
		String exptitle="sing up";
		for(String id:allwindowid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals(exptitle))
			{
				driver.manage().window().maximize();
				break;
			}
			else {
				System.out.println("child browser popup handle");
			}
		}

	}
}

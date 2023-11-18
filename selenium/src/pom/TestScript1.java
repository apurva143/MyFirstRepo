package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/login");
			
			RegisterPage page=new RegisterPage(driver);
			
		     page.getLinkText().click();
	         page.getGender().click();
	         page.getFirstname().sendKeys("Apurva");
	         page.getLaststname().sendKeys("Kasetty");
	         page.getEmail().sendKeys("apurva@gmail.com");
	         page.getPassword().sendKeys("appu@#");
	         page.getCfmpassword().sendKeys("appu@#");
	         page.getRegbutton().click();

		}

	}



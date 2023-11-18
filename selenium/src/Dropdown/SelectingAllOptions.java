package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAllOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Apoorva/dropdown.html");
		WebElement dropdown=driver.findElement(By.id("multiple"));
		Select select=new Select(dropdown);
		List<WebElement> allOptions=select.getOptions();
		//for(WebElement option:allOptions) {
    	//option.click();
		//}
		for(int i=0;i<allOptions.size();i++) {
			select.selectByIndex(i);
		}
		
		}

}

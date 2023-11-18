package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Apoorva/dropdown.html");
		WebElement dropdown=driver.findElement(By.id("single"));
		Select select=new Select(dropdown);
		select.selectByValue("3");
		Thread.sleep(2000);
		select.selectByVisibleText("sql");
		Thread.sleep(2000);
		select.selectByIndex(0);
		//System.out.println(select.getFirstSelectedOption().getText());
		//List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		List<WebElement> allSelectedOptions=select.getOptions();
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());
		}
		}

}

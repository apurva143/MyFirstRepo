package selen;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTheDataAndClick {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		String s=scan.next();
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//String data="seleniumclass830";
		WebElement SearchStore=driver.findElement(By.id("small-searchterms"));
        WebElement searchButton=driver.findElement(By.xpath("//input[@value='Search']"));
       // js.executeScript("arguments[0].value='"+data+"'",SearchStore);
        js.executeScript("arguments[0].value='"+s+"'",SearchStore);
        Thread.sleep(2000);
        js.executeScript("arguments[0].value=' '",SearchStore);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()", searchButton);
	}
}

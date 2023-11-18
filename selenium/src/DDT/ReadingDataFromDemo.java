package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromDemo {
	public static void main(String[] args)throws IOException {
	FileInputStream fis=new FileInputStream("./testdata/data.properties");
	Properties property=new Properties();
	property.load(fis);
	String value = property.getProperty("url");
	System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(value);
	 System.out.println(value);


	}

}

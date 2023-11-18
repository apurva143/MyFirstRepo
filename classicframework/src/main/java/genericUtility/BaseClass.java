package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public JavaScriptUtility js;
	PropertyUtility ppt=new PropertyUtility();
	@BeforeClass 
	public void launchindTheBrowser() throws IOException {
		if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"));
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	} else if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox"));
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}else {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get(ppt.readingDataFromPropertyFile("url"));
  }
  @BeforeMethod
  public void loadingObject() {
	  JavaScriptUtility js=new JavaScriptUtility();
  }
  public void closingBrowser() {
	  driver.quit();
  }
	
	
	

}

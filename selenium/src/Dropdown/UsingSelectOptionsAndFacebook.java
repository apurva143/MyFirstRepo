package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectOptionsAndFacebook {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805688%7Cb%7C%23fb%7C&placement=&creative=550525805688&keyword=%23fb&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311723615984%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwvrOpBhBdEiwAR58-3C72ldcWHvFgQ3qYUlGm8vOrTBwufgZtpC2qvvuO2itX1_onXU-YYBoCVHQQAvD_BwE");
			//**********************select the date*******************//
			WebElement dropdown=driver.findElement(By.id("day"));
			Select select=new Select(dropdown);

			select.selectByVisibleText("26");
			List<WebElement> allselectedOptions = select.getOptions();
			for(int i=0;i<allselectedOptions.size();i++) {
				select.selectByIndex(i);
			}
			//**********************get all count month days******************//
			List<WebElement> allselectedOption = select.getAllSelectedOptions();
			for(WebElement option:allselectedOption) {
				System.out.println(option.getText());
			}

			//*********************select  on month******************//
			WebElement dropdown1=driver.findElement(By.id("month"));
			Select select1=new Select(dropdown1);
			select1.selectByValue("6");
			List<WebElement> allselectedOptions1 = select1.getOptions();
			for(int i=0;i<allselectedOptions1.size();i++) {
				select1.selectByIndex(i);
			}


	        //****************select on year******************//
			WebElement dropdown2=driver.findElement(By.id("year"));
			Select select2=new Select(dropdown2);
			select2.selectByVisibleText("2023");
		}

	}



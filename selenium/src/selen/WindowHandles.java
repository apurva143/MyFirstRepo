package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./selenium/msedgedriver.exe");
		EdgeDriver ref=new EdgeDriver();
		ref.get("https://www.flipkart.com/search?q=apple+mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&as-pos=2&as-type=RECENT&suggestionId=apple+mobiles%7CMobiles&requestId=6ffec22b-53cb-459c-8047-7b767eef13a2&as-searchtext=apple");
	    ref.findElement(By.partialLinkText("APPLE iPhone 13 (Midnight, 128 GB)")).click();
	    System.out.println(ref.getWindowHandle()+"**********parent");
	    System.out.println(ref.getWindowHandles());
	    Thread.sleep(3000);
	    ref.quit();
	    

	}

}

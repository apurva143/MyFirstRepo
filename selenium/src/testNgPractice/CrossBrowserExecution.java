package testNgPractice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {
@Test
@Parameters("browser")
public void TC_001(String browser) {
	if(browser.equals("chrome")) {
		System.out.println("chrome is launching");
	}
	else {
		System.out.println("firefox is launching");
	}
	
}

}

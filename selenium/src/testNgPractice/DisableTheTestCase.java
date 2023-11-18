package testNgPractice;

import org.testng.annotations.Test;

public class DisableTheTestCase {
	@Test(priority=10)
	public void login() {
		System.out.println("i'm from login");
	}
	@Test(priority=-0)
	public void home() {
		System.out.println("i'm from home");
	}
@Test(priority=-1,enabled=false)
public void logout() {
	System.out.println("i'm from logout");
}
}

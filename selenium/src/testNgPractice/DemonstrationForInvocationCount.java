package testNgPractice;

import org.testng.annotations.Test;

public class DemonstrationForInvocationCount {
	@Test(invocationCount=5)
	public void login() {
		System.out.println("i'm from login");
	}

}

package testNgPractice;

import org.testng.annotations.Test;

public class DemonstrationForPriority {
	@Test
	public void login() {
		System.out.println("i'm from login");
	}
	@Test
	public void home() {
		System.out.println("i'm from home");
	}
	@Test
	public void logout() {
		System.out.println("i'm from logout");
	}
}

package testNgPractice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("from beforeSuite ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("from beforeTest ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("from beforeClass ");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("from beforeMethod ");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("from afterSuite ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("from afterTest ");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("from afterClass ");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("from afterMethod ");
	}
	@Test
	public void Suite() {
		System.out.println("from Suite ");
	}
	@Test
	public void method() {
		System.out.println("from method ");
	}
	
	
	}



package testNgPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertDemo {
@Test
public void demo() {
	String expectedTitle="demo";
	String actualTitle="sample";
	assertEquals(actualTitle, expectedTitle);
}
}

package testNgPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemonstrationForHardAssert {
@Test
public void demo() {
	String expectedTitle="demo";
	String actualTitle="sam";
	//Hard Assert
	assertEquals(actualTitle,expectedTitle,"the condition is not matching");
	//Soft Assert
//	SoftAssert soft=new SoftAssert();
//	soft.assertEquals(actualTitle, expectedTitle,"the condition is not matching");
//	System.out.println("done");
//	soft.assertAll();
}
}

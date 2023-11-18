package testNgPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("from onTestStart"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("from onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("from onTestFailure");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("from onTestStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("from onFinish");
	}
	
	}



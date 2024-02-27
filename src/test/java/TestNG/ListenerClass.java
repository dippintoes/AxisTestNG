package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test cases execution is started.");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test cases execution is successfully completed.");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test cases execution is failed.");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test cases execution is skipped.");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test cases execution failed with few cases passing");
	}
	
}

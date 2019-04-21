package SampleMaven.SampleMaven.Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class CustomListerner extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println(result.getMethod().getMethodName());
	Reporter.log(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+" Method passed");
	}

	public void onTestFailure(ITestResult result) {
		TakeSceenShot(result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

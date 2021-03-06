package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListeners implements ITestListener{  //ITestListener is inbuilt interface
ExtentReports e;
ExtentTest t;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		t = e.startTest(result.getMethod().getMethodName(), "has started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		t.log(LogStatus.PASS, result.getMethod().getMethodName()+"  has passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Fail");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		e = new ExtentReports("C:\\shibika\\gitrepos\\POMFramework\\test-output\\myreport.html");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		e.endTest(t);
		e.flush();
	}

}

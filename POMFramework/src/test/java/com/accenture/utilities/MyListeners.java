package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{  //ITestListener is inbuilt interface

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Pass");
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
		System.out.println("On TestNG start");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On TestNG finish");
	}

}

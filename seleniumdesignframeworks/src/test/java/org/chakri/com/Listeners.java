package org.chakri.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends POM1 implements ITestListener{

//
	public Listeners(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	ExtentTest test;
	ExtentReports extents=ExtentReport.extentReports();
	@Override
	 public void onTestStart(ITestResult result) {
		 test=extents.createTest(result.getMethod().getMethodName());
	  }
	@Override
	  public void onTestSuccess(ITestResult result) {
		
	 test.log(Status.PASS, "to be passed");
	  }

	@Override
	  public void onTestFailure(ITestResult result) {
	    test.fail(result.getThrowable());
	    //screenshot
	    String path=null;
	    try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch(Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
			 path=getScreeshot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    test.addScreenCaptureFromPath(path,result.getMethod().getMethodName());
	  }
	@Override
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	@Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }
	@Override
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }
	@Override
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	@Override
	  public void onFinish(ITestContext context) {
		extents.flush();
	  }

}

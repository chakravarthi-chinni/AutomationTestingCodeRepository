package chakri.basetest.org;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import chakri.global.org.ExtentReportsTest;

public class Listeners extends BaseTest implements ITestListener {
	ExtentTest test;
	WebDriver driver;
	ThreadLocal<ExtentTest> thread=new ThreadLocal<ExtentTest>();
	
	ExtentReports extent=ExtentReportsTest.extentReports();
	
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
		thread.set(test);
	    
	  }

	public void onTestSuccess(ITestResult result) {
	    thread.get().log(Status.PASS, "testcase is pass ");
	  }

	  
	public void onTestFailure(ITestResult result) {
		thread.get().fail(result.getThrowable());
	    
	    try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    String filePath=null;
	    try {
			filePath =getScreenShot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    thread.get().addScreenCaptureFromBase64String(filePath);
	    
	  }

	  
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }
	 
	public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }
	
}





































/*
 ExtentTest test;
	ExtentReports extent=ExtentReportsTest.extentReports();
	public void onTestStart(ITestResult result) {
		test= extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// not implemented
		test.log(Status.PASS, "pass the test");
	}

	public void onTestFailure(ITestResult result) {
		// not implemented
		test.fail(result.getThrowable());
		
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		String filePath=null;
		
		try {
			filePath= getScreenShot(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());  
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}


	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
		extent.flush();
	}

 */

package chakri.extentreports;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void reportsw() {
	
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esr=new ExtentSparkReporter(path);
		esr.config().setDocumentTitle("Test Results");
		esr.config().setReportName("Extent Report Details");
		
		 extent=new ExtentReports();
		 extent.attachReporter(esr);
		 extent.setSystemInfo("Tester", "Chakri");
	}
	
	
	@Test
	public void extentReportsDemo() {
		ExtentTest test=extent.createTest("extentReportsDemo");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("result not found");
		
		extent.flush();
	}

}

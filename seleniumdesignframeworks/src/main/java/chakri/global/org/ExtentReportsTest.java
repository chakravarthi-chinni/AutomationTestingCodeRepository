package chakri.global.org;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTest {
	
public static ExtentReports extentReports() {
	String createReportPath=System.getProperty("user.dir")+"//Reports//index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(createReportPath);
	reporter.config().setReportName("Shopping Application Testing");
	reporter.config().setDocumentTitle("Shopping App");
	
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(reporter);
	reports.setSystemInfo("Testing made by :", "chakravarthi chinni");
	return reports;
	
}

}

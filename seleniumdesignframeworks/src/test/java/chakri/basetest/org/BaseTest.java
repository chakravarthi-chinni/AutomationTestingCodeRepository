package chakri.basetest.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.chakri.com.LogInPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	 public WebDriver driver;
	 public LogInPage lip;
		
	public WebDriver intialization() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\chakri\\global\\org\\Global.properties");                 
		prop.load(fis);
		String browserName=System.getProperty("browser")!=(null) ? System.getProperty("browser") : prop.getProperty("browser");
		//String browserName=prop.getProperty("browse");
		
		if(browserName.contains("chrome")) {
			ChromeOptions coptions=new ChromeOptions();
			if(browserName.contains("headless")) {
			coptions.addArguments("headless");
			}
			
		driver = new ChromeDriver(coptions);
		driver.manage().window().setSize(new Dimension(1440, 900));
		
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();	
		}
		else if(browserName.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public LogInPage launchApplication() throws IOException {
		driver=intialization();
		lip=new LogInPage(driver);
		lip.landOnPage();
		return lip;
	}
	
	@AfterMethod(alwaysRun=true)
	public void applicationClose() {
		driver.close();
	}
	
	public String getScreenShot(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"//Reports//"+testCaseName+".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir")+"//Reports//"+testCaseName+".png";	
	}
	
}





















//public String getScreenShot(String testCaseName,WebDriver driver) throws IOException {
//	TakesScreenshot ts = (TakesScreenshot)driver;
//	File source = ts.getScreenshotAs(OutputType.FILE);
//	File destination = new File(System.getProperty("user.dir")+"\\Reports\\"+ testCaseName +".png");
//	FileUtils.copyFile(source, destination);
//	return System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
//	
//}


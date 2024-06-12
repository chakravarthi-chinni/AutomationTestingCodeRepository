package org.chakri.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	WebDriver driver;
	
	public POM1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
		@FindBy(id="userEmail")
		WebElement userEmail;
		
		@FindBy(id="userPassword")
		WebElement userPassword;
		
		@FindBy(id="login")
		WebElement submit;
		
		public void logInPage(String email,String pswd) {
			userEmail.sendKeys(email);
			userPassword.sendKeys(pswd);
			submit.click();	
		}
		
		public void landOnPage() {
			driver.get("https://rahulshettyacademy.com/client");
		}
		
		public String getScreeshot(String testCaseName,WebDriver driver) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File file=new File(System.getProperty("user.dir")+"//Reports"+testCaseName+".png");
			FileUtils.copyFile(source, file);
			return System.getProperty("user.dir")+"//Reports"+testCaseName+".png";
		}

}

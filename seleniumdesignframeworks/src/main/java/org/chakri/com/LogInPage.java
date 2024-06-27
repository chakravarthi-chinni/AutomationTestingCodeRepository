package org.chakri.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import chakri.absract.AbstractComponents;

public class LogInPage extends AbstractComponents{
	WebDriver driver;
	
	public LogInPage(WebDriver driver){
		super(driver);
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
		
		
		@FindBy(css = "div[aria-label='Incorrect email or password.']")
		WebElement errorValidate;
		public String getErrorMessage() {
			waitVisisbilityToWebElementAppear(errorValidate);
			System.out.println(errorValidate.getText());
			return errorValidate.getText();
		}

}

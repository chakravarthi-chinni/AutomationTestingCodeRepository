package org.chakri.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import chakri.absract.AbstractComponents;

public class SubmitOrder extends AbstractComponents{
	WebDriver driver;
	
	public SubmitOrder(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section[@class='ta-results list-group ng-star-inserted'] /button[2] ")
	WebElement countrySelections;
	public void countrySelection() {
		Actions a=new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "ind").build().perform();
		waitVisisbilityToWebElementAppear(countrySelections);
		countrySelections.click();	
	}
	
	@FindBy(xpath = "//a[.='Place Order ']")
	WebElement placeOrder;
	public void placedOrder() {
		placeOrder.click();
	}
	
	@FindBy(xpath = "//h1[.=' Thankyou for the order. ']")
	WebElement getTheText;
	public String submissionSuccess() {
		waitVisisbilityToWebElementAppear(getTheText);
		System.out.println(getTheText.getText());
		String text=getTheText.getText();
		return text;
	}
}

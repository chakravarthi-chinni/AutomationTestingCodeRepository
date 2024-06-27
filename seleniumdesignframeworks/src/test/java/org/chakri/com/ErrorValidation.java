package org.chakri.com;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import chakri.basetest.org.BaseTest;
import chakri.basetest.org.Retry;
import chakri.jsondata.ConvertJson;

public class ErrorValidation extends BaseTest {

	@Test(groups = { "errorValidations" },retryAnalyzer=Retry.class)
	public void loginErrorTest() throws IOException, InterruptedException {

		LogInPage lip = new LogInPage(driver);
		lip.logInPage("chakri123@gmail.com", "Chakri");
		Assert.assertEquals("Incorrect email or password.", lip.getErrorMessage());
		Thread.sleep(2000);
	}
	
	@Test(dataProvider="getData")
	public void submitOrderErrorTest(HashMap<String, String> input) throws InterruptedException, IOException {

		lip.logInPage(input.get("email"), input.get("pswd"));
		AddItemToCart ait = new AddItemToCart(driver,input.get("productName"));
		List<WebElement> listOfProducts = ait.listOfProducts();
		ait.addToCart(input.get("productName"));
		ait.goToCart();
		ait.checkCartList(input.get("productName"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
	    ait.checkOutProduct();
	    SubmitOrder so=new SubmitOrder(driver);
	    so.countrySelection();
	    so.placedOrder();
	    so.submissionSuccess();
		Thread.sleep(1000);

	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		ConvertJson cj=new ConvertJson();
		List<HashMap<String, String>> data=cj.jsonConvertToString();
		return new Object[][]{{data.get(0)}};
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//HashMap<String, String> hm=new HashMap<String,String>();
//hm.put("email", "chakri123@gmail.com");
//hm.put("pswd", "Chakri@123");
//hm.put("productName", "ADIDAS ORIGINAL");
//
//HashMap<String, String> hm1=new HashMap<String,String>();
//hm1.put("email", "chakri123@gmail.com");
//hm1.put("pswd", "Chakri@123");
//hm1.put("productName", "ADIDAS ORIGINAL");


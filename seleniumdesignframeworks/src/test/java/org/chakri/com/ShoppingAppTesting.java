package org.chakri.com;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import chakri.basetest.org.BaseTest;
import chakri.jsondata.JsonData;

public class ShoppingAppTesting extends BaseTest {
	
	// 3286262ba4ef4573b56641b03f5af256 paswd of jenkins

	@Test(dataProvider = "getData")
	public void ShoppingApplication(HashMap<String, String> input) throws  InterruptedException {

		lip.logInPage(input.get("email"), input.get("pswd"));
		AddItemToCart aitc = new AddItemToCart(driver,input.get("productName"));
		aitc.listOfProducts();
		//aitc.view();
		aitc.addToCart(input.get("productName"));
		aitc.goToCart();
		Thread.sleep(150);
		//CheckoutPage cop=new CheckoutPage(driver);
		aitc.checkCartList(input.get("productName"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(150);
		aitc.checkOutProduct();
	    SubmitOrder so=new SubmitOrder(driver);
	    so.countrySelection();
	    so.placedOrder();
	    String texte=so.submissionSuccess();
	    Assert.assertTrue(texte.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		

	}

//	@DataProvider
//	public String[][] getData() {
//		return new String[][] { { "chakri123@gmail.com", "Chakri@123", "ADIDAS ORIGINAL" },
//				{ "chakri123@gmail.com", "Chakri@123", "ADIDAS ORIGINAL" } };
//	}
	
	public String getScreenShot(String testCaseName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"\\reports"+testCaseName+".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir")+"\\reports"+testCaseName+".png";
	}

	
	@DataProvider
	public  Object[][] getData() throws IOException {
		JsonData jd=new JsonData();
		List<HashMap<String, String>> rawData=jd.jsonData();
		Object[][] data=new Object[][]{{rawData.get(0)}};
		return data;
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

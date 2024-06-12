package org.chakri.com;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import chakri.jsondata.ConvertJson;
import dev.failsafe.internal.util.Assert;

public class AutomationProject {

	@Test(dataProvider = "getData2")
	public  void standAloneApplication(HashMap<String, String> input) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		POM1 pom=new POM1(driver);
		pom.landOnPage();
		pom.logInPage(input.get("email"),input.get("pswd"));
		POM2 pom2=new POM2(driver);
		List<WebElement> listOfProducts=pom2.listOfProducts();
		pom2.selectedProductToCart(input.get("productName"));
		pom2.goToCart();
		pom2.checkCartList(input.get("productName"));
		pom2.checkOutProduct();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@style='list-style-type: none;'] /li[3] /button")));
//		
//		driver.findElement(By.xpath("//ul[@style='list-style-type: none;'] /li[3] /button")).click();
		

Thread.sleep(1000);
driver.close();


	}
	
	@DataProvider
	public String[][] getData() {
		return new String [][] {{"chakri123@gmail.com","Chakri@123","ADIDAS ORIGINAL"},{"chakri123@gmail.com","Chakri@123","ADIDAS ORIGINAL"}};
	}
	
	@DataProvider
	public Object [][] getData2() throws IOException {

		
		ConvertJson cj=new ConvertJson();
		List<HashMap<String, String>> data=cj.jsonConvertToString();
		
		return new Object[][] {{data.get(0)},{data.get(1)}};
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

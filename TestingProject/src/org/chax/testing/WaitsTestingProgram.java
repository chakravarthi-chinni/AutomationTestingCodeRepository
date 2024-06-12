package org.chax.testing;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsTestingProgram {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//create implicity wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		implicityWaitProgram(driver);
		
	}
	
	
	public static void implicityWaitProgram(WebDriver driver) {
//		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//WebDriverWait wait =new WebDriverWait(driver,5);
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		
		String productList[] = { "Cucumber", "Brocolli", "Cauliflower", "Tomato", "Onion" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			List<String> listOfProduct = Arrays.asList(productList);

			String[] productName = products.get(i).getText().split("-");
			String productName2 = productName[0].trim();
				if (listOfProduct.contains(productName2)) {
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					while(j==listOfProduct.size()) {
					break;
					}
				}
		}
		// .cart-preview.active
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		WebElement selection = driver.findElement(By.xpath("//select"));
		Select sel = new Select(selection);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		System.out.println(driver.findElement(By.xpath("//b")).getText());
		sel.selectByVisibleText("India");

		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		// driver.findElement(By)
		driver.close();
	}
	

	}





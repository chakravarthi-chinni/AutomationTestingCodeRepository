package org.chax.testing;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DebuggingTestingProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		
		String productList[] = { "Cucumber", "Brocolli", "Cauliflower", "Tomato", "Onion" };
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		// .cart-preview.active
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		Thread.sleep(6000);
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Thread.sleep(1000);
		WebElement selection = driver.findElement(By.xpath("//select"));
		Select sel = new Select(selection);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		System.out.println(driver.findElement(By.xpath("//b")).getText());
		sel.selectByVisibleText("India");

		driver.findElement(By.cssSelector(".chkAgree")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		// driver.findElement(By)
		Thread.sleep(3000);
		driver.close();
	}
}

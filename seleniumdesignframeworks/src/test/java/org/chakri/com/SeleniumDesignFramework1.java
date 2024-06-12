package org.chakri.com;

import java.time.Duration;
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
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class SeleniumDesignFramework1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("chakri123@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Chakri@123");
		driver.findElement(By.id("login")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> listOfProducts=driver.findElements(By.cssSelector(".mb-3"));
		System.out.println(listOfProducts);
		
		WebElement prod=listOfProducts.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		System.out.println(prod);
		prod.findElement(By.cssSelector(".btn.w-10.rounded")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		System.out.println(driver.findElement(By.id("toast-container")).getText());
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cartSection h3")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		List<WebElement> listOfCartElements=driver.findElements(By.cssSelector(".cartSection h3"));
		System.out.println(driver.findElement(By.cssSelector(".cartSection h3")).getText());
		boolean cartItem=listOfCartElements.stream().anyMatch(cartItems->cartItems.getText().equalsIgnoreCase("ZARA COAT 3"));
		
		System.out.println(cartItem);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Checkout')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		//driver.findElement(By.xpath("//ul[@style='list-style-type: none;'] /li[3] /button")).click();
		Actions a=new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")),"ind").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results.list-group.ng-star-inserted")));
		driver.findElement(By.xpath("//section /button[2]")).click();
		//driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted")).click();
//		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
	//	System.out.println(driver.findElement(By.cssSelector("h1[class='hero-primary']")).getText());
		
Thread.sleep(1000);
driver.close();


	}

}

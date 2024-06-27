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
		
		String[] items = { "IPHONE 13 PRO", "ZARA COAT 3", "ADIDAS ORIGINAL" };
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("chakri123@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Chakri@123");
		driver.findElement(By.id("login")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> listOfProducts = driver.findElements(By.cssSelector(".mb-3"));
		for (int i = 0; i < items.length; i++) {
			String name = items[i];
			WebElement prod = listOfProducts.stream()
					.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(name)).findFirst()
					.orElse(null);
			prod.findElement(By.cssSelector(".btn.w-10.rounded")).click();
			Thread.sleep(500);
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		System.out.println("get text is : " + driver.findElement(By.id("toast-container")).getText());
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cartSection h3")));
		
		js.executeScript("window.scrollBy(0,500)");

		// check cart items list with matching given product name
		List<WebElement> listOfCartElements = driver.findElements(By.cssSelector(".cartSection h3"));
		System.out.println("list of cart items : " + driver.findElement(By.cssSelector(".cartSection h3")).getText());
		boolean cartItem = listOfCartElements.stream()
				.anyMatch(cartItems -> cartItems.getText().equalsIgnoreCase("IPHONE 13 PRO"));

		System.out.println("cartItem is :" + cartItem);

		// checkout the product
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Checkout')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		Thread.sleep(100);
		js.executeScript("window.scrollBy(0,500)");
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "ind").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results.list-group.ng-star-inserted")));
		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//section /button[2]")));
         Thread.sleep(200);
		driver.findElement(By.xpath("//section /button[2]")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		// System.out.println(driver.findElement(By.cssSelector("h1[class='hero-primary']")).getText());

		Thread.sleep(1000);
		driver.close();

	}

}

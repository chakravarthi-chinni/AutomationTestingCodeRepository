package org.chax.testing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope

		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columnLinks = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		for (int i = 0; i < columnLinks.findElements(By.tagName("a")).size(); i++) {

			String linkClickedKey = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnLinks.findElements(By.tagName("a")).get(i).sendKeys(linkClickedKey);
			Thread.sleep(1500);

		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("is :" + driver.getTitle());
		}
		driver.close();
	}

}

package org.chax.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.JavascriptLogEntry;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTestingPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		int sum=0;

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> li=driver.findElements(By.cssSelector(".tableFixHead td:last-child"));
		for(int i=0;i<li.size();i++) {
			sum=sum+Integer.parseInt(li.get(i).getText());
		}
		System.out.println(sum);
	}

}

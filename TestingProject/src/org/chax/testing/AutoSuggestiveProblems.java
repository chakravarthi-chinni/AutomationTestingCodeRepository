package org.chax.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveProblems {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//			driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("in");
//			Thread.sleep(3000);
//			List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//			for(WebElement we:options) {
//				if(we.getText().equalsIgnoreCase("India")) {
//					we.click();
//					break;
//			}
//		}
//			//System.out.println(driver.findElement(By.cssSelector("input[id='autosuggest']")).getText());
//			driver.close();
			calenderProblems(driver);
	}
	
	
	public static void calenderProblems(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		driver.close();
		
	}

}

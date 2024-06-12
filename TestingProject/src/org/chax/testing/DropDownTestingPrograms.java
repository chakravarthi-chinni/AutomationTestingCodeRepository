package org.chax.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestingPrograms {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		dropDownList(driver);
//		selectDropDownList(driver);
		//dynamicDropDown(driver);
		autoSuggestive(driver);
		
	}
	public static void dropDownList(WebDriver driver)  {
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement we=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select=new Select(we);
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("INR");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("USD");
		System.out.println(select.getFirstSelectedOption().getText());
		driver.close();
		
	}
	public static void selectDropDownList(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		}
	
	public static void dynamicDropDown(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
		Thread.sleep(3000);
		driver.close();
	}
	public static void autoSuggestive(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("in");
		List<WebElement> options = driver.findElements(By.cssSelector("ul[id='ui-id-1']"));
		for(WebElement we:options) {
			if(we.getText().equalsIgnoreCase("India")) {
				we.click();
				break;
			}
		}
	}

}

package org.chax.testing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentWindow =it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		String text=driver.findElement(By.cssSelector(".im-para.red")).getText();
		String str=text.split("at ")[1].trim().split(" ")[0];
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(str);
		
		//driver.close();

	}

}

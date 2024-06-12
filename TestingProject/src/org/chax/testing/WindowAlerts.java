package org.chax.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlerts {
	

	public static void main(String[] args) throws InterruptedException {
		String name="chakravarthi";
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		driver.close();
		
	}

}

package org.chax.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationWindow {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

package org.chax.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//a[@title='Login'] //span")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 15");
		List<WebElement> mobileList=driver.findElements(By.cssSelector("._1sFryS._2x2Mmc._3ofZy1"));
		for(WebElement mList: mobileList) {
			if(mList.getText().equalsIgnoreCase("iphone 15")) {
				mList.click();
				break;
			}
		}
    //	driver.findElement(By.)
//		driver.findElement(By.)
//		driver.findElement(By.)
//		driver.findElement(By.)
//		driver.findElement(By.)
//		driver.findElement(By.)
//		driver.findElement(By.)
//		driver.findElement(By.)
		
		Thread.sleep(2000);
		driver.close();
	}

}

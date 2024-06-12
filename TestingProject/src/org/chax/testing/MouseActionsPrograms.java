package org.chax.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class MouseActionsPrograms {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//a[@title='Login'] //span")).click();
		Actions act=new Actions(driver);
		
		WebElement move=driver.findElement(By.cssSelector(".Pke_EE"));
		act.moveToElement(move).click().sendKeys("iphone 15").keyUp(Keys.SHIFT).build().perform();
//		List<WebElement> mobileList=driver.findElements(By.cssSelector("._1sFryS._2x2Mmc._3ofZy1"));
//		for(WebElement mList: mobileList) {
//			if(mList.getText().equalsIgnoreCase("iphone 15")) {
//				mList.click();
//				break;
//			}
//		}
		WebElement move2=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		act.moveToElement(move2).contextClick().build().perform();
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
	//9182662551

}

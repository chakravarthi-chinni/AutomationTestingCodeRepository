package org.chax.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPrograming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/dropable/");
		driver.findElement(By.xpath("//a[contains(text(),'Demos')]")).click();
		//driver.findElement(By.xpath(" //a[contains(text(),'Draggable')][1]")).click();
		driver.findElement(By.xpath("//a[.='Droppable'][1]")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a=new Actions(driver);
		WebElement Draggable=driver.findElement(By.id("draggable"));
		WebElement Dropable=driver.findElement(By.id("droppable"));
		a.dragAndDrop(Draggable, Dropable);
		driver.switchTo().defaultContent();
		driver.close();

	}

}

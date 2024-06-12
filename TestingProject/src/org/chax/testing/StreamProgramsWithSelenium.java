package org.chax.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamProgramsWithSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//tr //td[1]"));
//		for(int i=0;i<names.size();i++) {
//			System.out.println(names.get(i).getText());
//		}
		List<String> originalList = names.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> newList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(originalList, newList);
		List<String> price;

		// following-sibling::td[.='38']

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Rice"))

					.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));
// for pagination
			if (price.size() < 1)

			{

				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}

		} while (price.size() < 1);
		Thread.sleep(1500);
		driver.close();

	}

	public static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return pricevalue;

	}

}

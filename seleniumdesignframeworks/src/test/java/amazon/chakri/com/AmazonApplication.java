package amazon.chakri.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazon.chakri.org.LandingPage;
import amazon.chakri.org.ProductSelection;

public class AmazonApplication {
	 
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String productName="iphone 15";	
		LandingPage lp=new LandingPage(driver);
		lp.landingPage();
		ProductSelection ps=new ProductSelection(driver,productName);
		ps.itemSearch();
//		ps.choosenItem(productName);
		//div [@class='s-suggestion-container']
		Thread.sleep(1000);
		List<WebElement> searchList=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println(searchList);
		WebElement items=searchList.stream().
				filter(item->item.getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
		System.out.println(items);
		items.click();
		
	}

}

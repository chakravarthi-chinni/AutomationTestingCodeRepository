package amazon.chakri.org;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSelection {
	WebDriver driver;
	String productName;
	
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/b/ref=surl_fashion/?_encoding=UTF8&node=6648217031&pd_rd_w=e6MPI&content-id=amzn1.sym.4a33b274-4a92-4677-9316-870f15d40ae0&pf_rd_p=4a33b274-4a92-4677-9316-870f15d40ae0&pf_rd_r=6JPKGZGD2FWC45F0ECY1&pd_rd_wg=ljYTz&pd_rd_r=c94d3b85-c6dd-4050-86dc-18cbd722cf00&ref_=pd_hp_d_hero_unk");
//		//driver.findElement(By.id("twotabsearchtextbox")).click();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
//		//div [@class='s-suggestion-container']
//		
//		Thread.sleep(1000);
//		driver.close();
//	}
	public ProductSelection(WebDriver driver,String productName) {
		this.driver=driver;
		this.productName=productName;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement serachItem;
	
	public void itemSearch() {
		serachItem.sendKeys(productName);
	}
	By waits=By.xpath("//div [@class='s-suggestion-container']");
	@FindBy(xpath = "//div [@class='s-suggestion-container']")
	List<WebElement> searchItemsList;
	public List<WebElement> productSelection() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(waits));
		return searchItemsList;
		
	}
	
	public void choosenItem(String productName) {
		//WebElement itemSearchs=(WebElement) searchItemsList.stream().
				//filter(itemList->itemList.findElement(By.xpath("//div [@class='s-suggestion-container']")).getText().equalsIgnoreCase(productName));
		//itemSearchs.click();
//		System.out.println(itemSearch);
		
		//.a-size-medium.a-color-base.a-text-normal
	}
//	@FindBy(xpath = "//div[@data-csa-c-type='item']")
	
	@FindBy(css = ".a-size-medium.a-color-base.a-text-normal")
	List<WebElement> itemList;
	public List<WebElement> chooseItem() {
		return itemList;
	}
	
	//public void 
	
}

package org.chakri.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import chakri.absract.AbstractComponents;

public class AddItemToCart extends AbstractComponents{
	WebDriver driver;
	String productName;
	
	
	public AddItemToCart(WebDriver driver,String productName) {
		super(driver);
		this.productName=productName;
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	

	//By product=By.cssSelector(".mb-3");
//	
//	@FindBy(css = ".mb-3")
//	List<WebElement> items;
//	public void view() {
//		System.out.println("product is :"+product);
//		System.out.println("items is : "+items);
//	}
	
	public List<WebElement> listOfProducts() throws InterruptedException {
		Thread.sleep(1000);
//		waitVisibilityToAppear(product);
//		waitVisisbilityToListWebElementAppear(items);
		List<WebElement> items = driver.findElements(By.cssSelector(".mb-3"));
	
		return items;
	}
	//select the product
	public WebElement productSelection(String productName) throws InterruptedException {
		WebElement selectedProduct=listOfProducts().stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName)).findAny().orElse(null);  
		return selectedProduct;	
	}
	
	By selectedItemToCart=By.xpath("//div /button[contains(text(),'Add To Cart')]");
	public void addToCart(String productName) throws InterruptedException {
		productSelection(productName).findElement(selectedItemToCart).click();
		
	}
	
	//go to cart
	By toaster=By.id("toast-container");
	
	@FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
	WebElement viewCart;
	
	public void goToCart() throws InterruptedException  {
		waitVisibilityToAppear(toaster);	
		Thread.sleep(1000);
		//waitVisisbilityToWebElementAppear(viewCart);
		viewCart.click();
		
	}
	@FindBy(xpath = ("//button[contains(text(),'Checkout')]"))
	WebElement checkOut;
	
	@FindBy(xpath = "//div[@class='cartSection'] /h3")
	List<WebElement> cartListedItems;
	public boolean checkCartList(String productName) {
		waitVisisbilityToWebElementAppear(checkOut);
		boolean checkItems=cartListedItems.stream().anyMatch(cartItems->cartItems.getText().equalsIgnoreCase(productName));
		System.out.println("checkit :"+checkItems);
		return checkItems;
	}
	
	//By checkOutWait=By.xpath("//button[contains(text(),'Checkout')]");
	
	public void checkOutProduct() throws InterruptedException {
		waitVisisbilityToWebElementAppear(checkOut);
//		Thread.sleep(2000);
		checkOut.click();
	}
	
}























/*driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
 * 
 * By productToCart=By.cssSelector(".btn.w-10.rounded");
By toaster=By.id("toast-container");
By listCart=By.cssSelector(".cartSection h3");


public void addProductToCart(String productName) throws InterruptedException  {
	WebElement prod=byProductName(productName);
	prod.findElement(productToCart).click();
	
	
}
public void goToCart() throws InterruptedException {
	waitVisibilityToAppear(toaster);
	waitInvisibilityToAppear();
	submit.click();
}

public List<WebElement> listOfCart(){
	waitVisibilityToAppear(listCart);
	return listOfCartElements;
	
}


@FindBy(css =".ng-animating")
WebElement element;

@FindBy(xpath ="//button[@routerlink='/dashboard/cart']" )
WebElement submit;

@FindBy(css = ".cartSection h3")
List<WebElement> listOfCartElements;

public WebElement byProductName(String productName) throws InterruptedException {
	WebElement prod=listOfProducts().stream()
			.filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName))
			.findFirst().orElse(null);
	return prod;

}

List<WebElement> listOfCartElements=driver.findElements(By.cssSelector(".cartSection h3"));
*/



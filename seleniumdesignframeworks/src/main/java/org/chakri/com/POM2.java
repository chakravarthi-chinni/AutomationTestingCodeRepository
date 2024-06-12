package org.chakri.com;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import chakri.absract.AbstractComponents;

public class POM2 extends AbstractComponents{
	WebDriver driver;
	String productName;
	
	public POM2(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//List<WebElement> listOfProducts=driver.findElements(By.cssSelector(".mb-3"));
	@FindBy(css =".mb-3")
	List<WebElement> products;
	
	By product =By.cssSelector(".mb-3");
	public List<WebElement> listOfProducts() throws InterruptedException {
		waitVisibilityToAppear(product);
		return products;
	}
	//select the product
	public WebElement productSelection(String productName) throws InterruptedException {
		WebElement selectedProduct=listOfProducts().stream().
		filter(selectProduct->(selectProduct.findElement(By.cssSelector("b")).getText()).equals(productName))
		.findFirst().orElse(null);
		return selectedProduct;
		
	}
	
//	@FindBy(xpath = "//div /button[contains(text(),'Add To Cart')] ")
	//WebElement selectedItemToCart;
	By selectedItemToCart=By.xpath("//div /button[contains(text(),'Add To Cart')]");
	
	public void selectedProductToCart(String productName) throws InterruptedException {
		productSelection(productName).findElement(selectedItemToCart).click();
		
	}
	
	//go to cart
	By toaster=By.id("toast-container");
	
	@FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
	WebElement addToCart;
	
	public void goToCart() throws InterruptedException {
		waitVisibilityToAppear(toaster);
		waitInvisibilityToAppear();	
		addToCart.click();
		
	}
	
	@FindBy(xpath = "//div[@class='cartSection'] /h3")
	List<WebElement> cartListedItems;
	public boolean checkCartList(String productName) {
		boolean checkItems=cartListedItems.stream().anyMatch(cartItems->cartItems.getText().equalsIgnoreCase(productName));
		return checkItems;
	}
	
	By checkOutWait=By.xpath("//div[@class='subtotal cf ng-star-inserted'] /ul /li[@class='totalRow'][3]");
	@FindBy(xpath = "//div[@class='subtotal cf ng-star-inserted'] /ul /li[@class='totalRow'][3]")
	WebElement checkOut;
	public void checkOutProduct() throws InterruptedException {
		//waitVisibilityToAppear(checkOutWait);
		System.out.println("start");
		Thread.sleep(2000);
		checkOut.click();
		System.out.println("end");
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
	
	
	
	

}

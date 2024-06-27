package cucmbers.stepdefinition;

import java.io.IOException;

import org.chakri.com.AddItemToCart;
import org.chakri.com.LogInPage;
import org.chakri.com.SubmitOrder;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import chakri.basetest.org.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionCucumber extends BaseTest {
	public AddItemToCart aitc;
	public LogInPage lip;
	public SubmitOrder so;

	@Given("land on shopping application")
	public void land_on_shopping_application() throws IOException {
		launchApplication();

	}

	@Given("^login in an application with username (.+) and password (.+)$")
	public void login_in_an_application_with_username_and_password(String email ,String pswd) {
		lip.logInPage(email, pswd);
	}

	@When("^select the product (.+) and add to cart$")
	public void select_the_product_to_cart(String productName) throws InterruptedException {
		aitc.addToCart(productName);
		aitc.goToCart();

	}
	@When("^checkout the (.+) and submit order$") 
	public void checkout_product(String productName) throws InterruptedException {
		Thread.sleep(150);
		//CheckoutPage cop=new CheckoutPage(driver);
		aitc.checkCartList(productName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(150);
		aitc.checkOutProduct();
	}
	@Then ("get the message from after place the order is {string}")
	public void place_the_order(String string) {
		SubmitOrder so=new SubmitOrder(driver);
	    so.countrySelection();
	    so.placedOrder();
	    String texte=so.submissionSuccess();
	    Assert.assertTrue(texte.equalsIgnoreCase(string));
		
	}

}

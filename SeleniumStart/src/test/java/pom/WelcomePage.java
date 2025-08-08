package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText = "Register")
	private WebElement registerpage;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcart;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getRegisterpage() {
		return registerpage;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}
	
	

	
	}
	

	


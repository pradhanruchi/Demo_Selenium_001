package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	private WebElement booksLink;
	
	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	private WebElement computersLink;
	
	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	private WebElement electronicsLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

}

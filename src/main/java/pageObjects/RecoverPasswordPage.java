package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoverPasswordPage {

	public RecoverPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// -----------------------------------------------------------------------------------
	// Objects Statement

	@FindBy(css = ".main-hero>h1")
	private WebElement resetTitle;

	@FindBy(id = "user_email")
	private WebElement email;

	@FindBy(css = "[type='submit']")
	private WebElement sendInstructions;

	@FindBy(css = "header>div")
	public static WebElement mainBar;

	// -----------------------------------------------------------------------------------
	// Methods statement
	
	public boolean titleVisibility() {
		return resetTitle.isDisplayed();	
	}
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void submitData() {
		sendInstructions.submit();
	}

	private WebDriver driver;
}

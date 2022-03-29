package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Web ELemets
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Sign in']")
	WebElement SignInBUtton_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankCash;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement New_Account;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement Account_Title;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement Initail_Balance;

	// Methods to interact with the elements
	public void insertUserName(String userName) {
		UserName_Element.sendKeys(userName);
	}

	public void insertPassword(String password) {
		Password_Element.sendKeys(password);
	}

	public void clickSignInButton() {
		SignInBUtton_Element.click();
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public void bankCash() {
		BankCash.click();
	}

	public void newAccount() {
		New_Account.click();
	}

	public void accountTitle(String title) {
		Account_Title.sendKeys(title);
	}

	public void discription(String description) {
		Description.sendKeys(description);
	}
	public void balance(String balance) {
		Initail_Balance.sendKeys(balance);
	}
}

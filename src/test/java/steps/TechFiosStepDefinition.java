package steps;


import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DataBasePage;
import pages.LoginPage;
import pages.TestBase;

public class TechFiosStepDefinition extends TestBase {
	LoginPage loginPage;
	DataBasePage databasepage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasepage = new DataBasePage();
	}

	@Given("User is on techfios login page")
	public void user_is_on_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/\\r\\n");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) {

		loginPage.insertUserName(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.insertPassword(password);
		Thread.sleep(3000);

	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginPage.clickSignInButton();

	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenShot(driver);
	}

	@Then("^User should not land on dashboard page$")
	public void user_should_not_land_on_dashboard_page() throws Throwable {
		Assert.assertNotSame("Login - iBilling", loginPage.getPageTitle());
	}
	@Then("User shoul click on the cash and bank")
	public void user_shoul_click_on_the_cash_and_bank() {
	  loginPage.bankCash();
	}
	@Then("User should click on the New Account")
	public void user_should_click_on_the_New_Account() {
	  loginPage.newAccount();
	}
	@Then("User should insert the title as {string}")
	public void user_should_insert_the_title_as(String string) {
	   loginPage.accountTitle(string);
	}
	@Then("User should insert the description as {string}")
	public void user_should_insert_the_description_as(String string) {
	   loginPage.discription(string);
	}
	
	@Then("User should insert the intial balance as {string}")
	public void user_should_insert_the_intial_balance_as(String string) {
	   loginPage.balance(string);
	}
	@When("^User enters \"([^\"]*)\" from techfios database$")
	public void user_enters_from_techfios_database(String loginData) throws Throwable {
	  switch(loginData) {
	  case "username" :
		  loginPage.insertUserName(databasepage.getData("username"));
		  System.out.println("UserName from DB:" + databasepage.getData("username"));
		  break;
	  case "password" :
		  loginPage.insertPassword(databasepage.getData("password"));
		  System.out.println("password from DB" + databasepage.getData("password"));
	  break;
	  
	  default:
		  System.out.println("Unable to enter Login data from DB");
	  }
	}

	@After
	public void afterRun() {
		//driver.close();
	}
}

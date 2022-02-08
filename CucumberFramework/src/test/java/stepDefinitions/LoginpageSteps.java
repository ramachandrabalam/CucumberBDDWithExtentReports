package stepDefinitions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.com.driversfactory.Driverfactory;

public class LoginpageSteps {

	private Loginpage loginPage = new Loginpage(Driverfactory.getDriver());
	
	@Given("^Load the website \"([^\"]*)\"$")
	public void load_the_website(String webUrl) throws Throwable {
	    Driverfactory.getDriver().get(webUrl);
	}

	@When("^Click on myaccount button$")
	public void click_on_myaccount_button() throws Throwable {
		loginPage.clickMyaccountlink();
	}

	@When("^Enter username \"([^\"]*)\"$")
	public void enter_username(String userName) throws Throwable {
		 loginPage.enterUsername(userName);
	}

	@When("^Enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		  loginPage.enterPassword(password);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		  loginPage.clickLoginbtn();
	}

	@Then("^Click on signout$")
	public void click_on_signout() throws Throwable {
		  loginPage.clickSignoutBtn();
	}

}

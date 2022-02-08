package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.pageObjects.Loginpage;
import com.pageObjects.Myaccountpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import qa.com.driversfactory.Driverfactory;

public class MyaccountpageSteps {
	private Myaccountpage myAccountpage = new Myaccountpage(Driverfactory.getDriver());
	private Loginpage loginPage = new Loginpage(Driverfactory.getDriver());
	
	@When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String userName, String password) throws Throwable {
		loginPage.enterUsername(userName);
		loginPage.enterPassword(password);
		loginPage.clickLoginbtn();
	}

	@When("^Menu contains the following items$")
	public void menu_contains_the_following_items(DataTable myaccountList) throws Throwable {
		List<String> expectedList=myaccountList.asList();
		List<String> actualList = myAccountpage.myAccountItems();
		Assert.assertEquals(expectedList, actualList);
	}

	@Then("^verify the items are (\\d+)$")
	public void verify_the_items_are(int itemsCount) throws Throwable {
		int expectedCount=myAccountpage.myAccountItems().size();
		Assert.assertEquals(expectedCount, itemsCount);
	}
}

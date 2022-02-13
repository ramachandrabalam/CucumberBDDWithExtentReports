package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	

	@When("^Menu contains the following items$")
	public void menu_contains_the_following_items(DataTable myaccountList) throws Throwable {
		List<String> expectedMenu=myaccountList.asList();
		List<String> actualMenut=myAccountpage.myAccountMenu();
		System.out.println(expectedMenu);
		System.out.println(actualMenut);
		Assert.assertTrue(actualMenut.containsAll(expectedMenu));
		}
		
		

	@Then("^verify the items are (\\d+)$")
	public void verify_the_items_are(int itemsCount) throws Throwable {
		int actualCount=myAccountpage.menuItemsCount();
		Assert.assertEquals(itemsCount, actualCount);
	}
}

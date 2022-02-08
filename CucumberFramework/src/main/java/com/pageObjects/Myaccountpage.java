package com.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myaccountpage {
	private WebDriver driver;
	private WebElement menuDriver;
	private By myAccountMenu = By.cssSelector(".woocommerce-MyAccount-navigation");
	private By myAccountItems = By.tagName("a");
	List<String> actualList = new ArrayList<>();
	public Myaccountpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void myAccountMenu() {
		WebElement menuDriver =driver.findElement(myAccountMenu);
	}
	
	public List<String> myAccountItems() {
		List<WebElement> items=menuDriver.findElements(myAccountItems);
		for(int i=0;i<items.size();i++) {
			String menuItems=menuDriver.findElements(myAccountItems).get(i).getText();
			 actualList.add(menuItems);
		}
		return actualList;
	}
	
	
	
	
	
	
	
	
	
}

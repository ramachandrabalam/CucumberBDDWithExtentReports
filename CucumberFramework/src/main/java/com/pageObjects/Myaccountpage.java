package com.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myaccountpage {
	private WebDriver driver;
	List<String> actualList = new ArrayList<>();
	private By myAccountMenuItems = By.xpath("//nav[@class='woocommerce-MyAccount-navigation']/ul/li");
	public Myaccountpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public List<String> myAccountMenu() {
		List<WebElement> listItems=driver.findElements(myAccountMenuItems);
		for(int i=0;i<listItems.size(); i++) {
			String listName=listItems.get(i).getText();
			actualList.add(listName);
		}
		return actualList;
	}
}

	
	
	
	
	
	
	
	
	


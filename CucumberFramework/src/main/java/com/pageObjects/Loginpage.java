package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	private WebDriver driver;
	
	private By myAccountlink = By.linkText("My Account");
	private By userName		 = By.id("username");
	private By password      = By.id("password");
	private By loginBtn	     = By.xpath("//input[@name='login']");
	private By signOutBtn    = By.linkText("Sign out");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void  clickMyaccountlink() {
		driver.findElement(myAccountlink).click();
	}
	
	public void enterUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginbtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void clickSignoutBtn() {
		driver.findElement(signOutBtn).click();
	}
	
	
	
	
	

}

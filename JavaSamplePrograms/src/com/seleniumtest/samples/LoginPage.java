package com.seleniumtest.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//get the fields
	private By unameLocator = By.id("uanme");
	private By passwdLocator = By.name("passwd");
	private By submitButtonLocator = By.xpath("//input[@id='submit']");
	
	public LoginPage enterUserName(String uname){
		driver.findElement(unameLocator).sendKeys(uname);
		return this;
	}
	
	public LoginPage enterPassword(String passwd){
		driver.findElement(passwdLocator).sendKeys(passwd);
		return this;
	}
	
	public HomePage submit(){
		driver.findElement(submitButtonLocator).submit();
		return new HomePage(driver);
	}
	
	public HomePage Login(String uname, String passwd){
		enterUserName(uname);
		enterPassword(passwd);
		return submit();
	}
	
	public LoginPage SubmitError(){
		driver.findElement(submitButtonLocator).submit();
		return new LoginPage(driver);
	}
}

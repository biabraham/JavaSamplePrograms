package com.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestGoogleSearchPage {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
		page.searchFor("cheese");
		//page.
		
	}

}

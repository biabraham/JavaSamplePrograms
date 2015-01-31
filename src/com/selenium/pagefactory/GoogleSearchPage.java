package com.selenium.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {

	public GoogleSearchPage() {
		// TODO Auto-generated constructor stub
	}
	
	@CacheLookup
	@FindBy(how = How.NAME,using="q")
	private WebElement searchBox;
	
	private WebElement q;
	 
	public void searchFor(String searchString){
		/*q.sendKeys(searchString);
		q.submit();*/
		searchBox.sendKeys(searchString);
		searchBox.submit();
	}

}

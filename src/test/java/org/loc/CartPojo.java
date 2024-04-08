package org.loc;

import org.edu.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPojo extends UtilityClass {
	
	public CartPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getWriteIn() {
		return writeIn;
	}

	public WebElement getItem1() {
		return item1;
	}

	public WebElement getAdd() {
		return add;
	}
@CacheLookup
@FindBy(xpath="//button[@type='submit']")
WebElement searchbox;

@CacheLookup
@FindBy(xpath="//input[@name='q']")
WebElement writeIn;

@CacheLookup
@FindBy(xpath="//*[text()='Jasmine Oil'][1]")
WebElement item1;

@CacheLookup
@FindBy(xpath="//button[text()='Add to bag'][1]")
WebElement add;
	
}

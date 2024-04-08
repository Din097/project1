package org.loc;

import org.edu.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePojo extends UtilityClass{

	public StorePojo() {
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Help')]")
	WebElement helpBtn;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	WebElement ContactBtn;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Shipping & Returns')]")
	WebElement returnBtn;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Find A Store')]")
	WebElement storeBtn;
	

	@CacheLookup
	@FindBy(xpath="//input[@placeholder='Enter a location']")
	WebElement location;
	
	@CacheLookup
	@FindBy(xpath="//label[text()='Search Radius']")
	WebElement radius;
	
	@CacheLookup
	@FindBy(xpath="//option[text()='30']")
	WebElement selectRadius;
	
	
	@CacheLookup
	@FindBy(xpath="//option[text()='Kilometer']")
	WebElement selectMasurement;
	
	
	
	@CacheLookup
	@FindBy(xpath="//button[text()='Search']")
	WebElement searchBtn;



	public WebElement getHelpBtn() {
		return helpBtn;
	}



	public WebElement getContactBtn() {
		return ContactBtn;
	}



	public WebElement getReturnBtn() {
		return returnBtn;
	}



	public WebElement getStoreBtn() {
		return storeBtn;
	}



	public WebElement getLocation() {
		return location;
	}



	public WebElement getRadius() {
		return radius;
	}



	public WebElement getSelectRadius() {
		return selectRadius;
	}



	public WebElement getSelectMasurement() {
		return selectMasurement;
	}



	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	
}

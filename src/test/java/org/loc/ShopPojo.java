package org.loc;

import org.edu.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPojo extends UtilityClass{
	public ShopPojo() {
		PageFactory.initElements(driver, this);
	}
	
	

	@CacheLookup
	@FindBy(xpath="/html/body/div[3]/section/div[1]/div[1]/button")
	WebElement dropDown;
	
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Natural Remedies')]")
	WebElement shop1;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Sleep')]")
	WebElement btn1;
	


	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Diffusers & Blends')]")
	WebElement shop2;
	

	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Bundle Builder')][1]")
	WebElement btn2;
	
	
	

	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Essential Oils')]")
	WebElement shop3;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Roll-ons')]")
	WebElement btn3;
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Home care')]")
	WebElement shop4;
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Home Cleaning')]")
	WebElement btn4;
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Body care')]")
	WebElement shop5;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Deodorants')]")
	WebElement btn5;
	
	public WebElement getDropDown() {
		return dropDown;
	}

	public WebElement getShop1() {
		return shop1;
	}

	public WebElement getBtn1() {
		return btn1;
	}

	public WebElement getShop2() {
		return shop2;
	}

	public WebElement getBtn2() {
		return btn2;
	}

	public WebElement getShop3() {
		return shop3;
	}

	public WebElement getBtn3() {
		return btn3;
	}

	public WebElement getShop4() {
		return shop4;
	}

	public WebElement getBtn4() {
		return btn4;
	}

	public WebElement getShop5() {
		return shop5;
	}

	public WebElement getBtn5() {
		return btn5;
	}

	public WebElement getShop6() {
		return shop6;
	}

	public WebElement getBtn6() {
		return btn6;
	}



	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Skincare')][1]")
	WebElement shop6;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Face Masks')][1]")
	WebElement btn6;

	
	
	

}

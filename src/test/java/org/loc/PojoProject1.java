package org.loc;

import org.edu.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoProject1 extends UtilityClass{

	
	public PojoProject1() {
		PageFactory.initElements(driver, this);
	
	}
	
	@CacheLookup
	@FindAll
	({@FindBy(xpath="//a[@href='/account/login']"),
	@FindBy(xpath="//a[@class='text-black']")})
	WebElement register;
	
	
	@CacheLookup
	@FindBy(xpath= "//input[@id='CustomerEmail']")
	WebElement email;
	
	@CacheLookup
	@FindBy(xpath="//input[@id='CustomerPassword']")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signin;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
}

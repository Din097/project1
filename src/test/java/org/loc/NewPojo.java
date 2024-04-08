package org.loc;

import org.edu.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPojo extends UtilityClass{
public NewPojo() {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}


@CacheLookup
@FindAll
({@FindBy(xpath="//a[@href='/account/login']"),
@FindBy(xpath="//a[@class='text-black']")})
WebElement register;


@CacheLookup
@FindBy(xpath="//*[@id=\"customer_login\"]/a[2]")
WebElement createNew;

@CacheLookup
@FindBy(xpath="//input[@id='RegisterForm-FirstName']")
WebElement fst_Name;

@CacheLookup
@FindBy(xpath="//input[@id='RegisterForm-LastName']")
WebElement lst_Name;

@CacheLookup
@FindBy(xpath="//input[@name='customer[email]']")
WebElement eMail;



@CacheLookup
@FindBy(xpath="//input[@name='customer[password]']")
WebElement passWord;


@CacheLookup
@FindBy(xpath="//select[@id='BirthdayMonth']")
WebElement clickMonth;


@CacheLookup
@FindBy (xpath="//*[text()='July']")
WebElement selectMonth;

@CacheLookup
@FindBy(xpath="//select[@id='BirthdayDay']")
WebElement clickDay;


@CacheLookup
@FindBy(xpath="//*[text()='9']")
WebElement selectDay;




@CacheLookup
@FindBy(xpath="//select[@id='BirthdayYear']")
WebElement clickYear;


@CacheLookup
@FindBy(xpath="//*[text()='1992']")
WebElement selectYear;


@CacheLookup
@FindBy(xpath="//*[text()='Create']")
WebElement create;

public WebElement getFst_Name() {
	return fst_Name;
}


public WebElement getLst_Name() {
	return lst_Name;
}


public WebElement geteMail() {
	return eMail;
}


public WebElement getPassWord() {
	return passWord;
}


public WebElement getClickMonth() {
	return clickMonth;
}


public WebElement getSelectMonth() {
	return selectMonth;
}


public WebElement getClickDay() {
	return clickDay;
}


public WebElement getSelectDay() {
	return selectDay;
}


public WebElement getClickYear() {
	return clickYear;
}


public WebElement getSelectYear() {
	return selectYear;
}


public WebElement getCreate() {
	return create;
}


public WebElement getRegister() {
	return register;
}


public WebElement getCreateNew() {
	return createNew;
}




}

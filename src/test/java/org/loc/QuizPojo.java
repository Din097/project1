package org.loc;

import org.edu.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuizPojo extends UtilityClass {
public QuizPojo() {
	PageFactory.initElements(driver, this);
}

@CacheLookup
@FindBy(xpath="//a[starts-with(@class,'text-headline-tag justify-')][1]")
WebElement quizBtn;

@CacheLookup
@FindBy(xpath="//div[text()='Myself']")
WebElement myselfButton;

@CacheLookup
@FindBy(xpath="//div[text()='Next']")
WebElement nxtBtn;


@CacheLookup
@FindBy(xpath="//div[text()='100% natural skin and body care']")
WebElement fst_btn;

@CacheLookup
@FindBy(xpath="//div[text()='Next']")
WebElement nxtBtn1;

@CacheLookup
@FindBy(xpath="//div[text()='Personal care routine']")
WebElement secondBtn;

@CacheLookup
@FindBy(xpath="//div[text()='Next']")
WebElement nxtBtn2;

@CacheLookup
@FindBy(xpath="//*[text()='Whole body']")
WebElement thirdBtn;

@CacheLookup
@FindBy(xpath="//div[text()='Next']")
WebElement nxtBtn3;

@CacheLookup
@FindBy(xpath="//div[text()='Herbal']")
WebElement fourthBtn;

@CacheLookup
@FindBy(xpath="//div[text()='Next']")
WebElement nxtBtn4;


public WebElement getResultBtn() {
	return resultBtn;
}


@CacheLookup
@FindBy(xpath="//button[text()='NO, THANKS. JUST SEE MY RESULTS']")
WebElement resultBtn;




public WebElement getQuizBtn() {
	return quizBtn;
}

public WebElement getMyselfButton() {
	return myselfButton;
}

public WebElement getNxtBtn() {
	return nxtBtn;
}

public WebElement getFst_btn() {
	return fst_btn;
}

public WebElement getNxtBtn1() {
	return nxtBtn1;
}

public WebElement getSecondBtn() {
	return secondBtn;
}

public WebElement getNxtBtn2() {
	return nxtBtn2;
}

public WebElement getThirdBtn() {
	return thirdBtn;
}

public WebElement getNxtBtn3() {
	return nxtBtn3;
}

public WebElement getFourthBtn() {
	return fourthBtn;
}

public WebElement getNxtBtn4() {
	return nxtBtn4;
}



}

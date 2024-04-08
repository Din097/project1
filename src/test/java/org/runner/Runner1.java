package org.runner;

import java.io.IOException;


import org.edu.UtilityClass;
import org.loc.CartPojo;
import org.loc.PojoProject1;
import org.loc.QuizPojo;
import org.loc.ShopPojo;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Runner1 extends UtilityClass {
public static void main(String[] args) throws InterruptedException, IOException {
	openChrome();
	openWebPage("https://www.saje.ca/");
	maxWindow();
	Thread.sleep(3000);
	
	
	
/*	ShopPojo s = new ShopPojo();
	
	Actions a = new Actions(driver);
	
	jfast(s.getDropDown());
jfast(s.getShop1());
jfast(s.getBtn1());

ShopPojo s = new ShopPojo();
jfast(s.getDropDown());
jfast(s.getShop2());
jfast(s.getBtn2());

ShopPojo s = new ShopPojo();
jfast(s.getDropDown());
jfast(s.getShop3());
jfast(s.getBtn3());

ShopPojo s = new ShopPojo();
jfast(s.getDropDown());
jfast(s.getShop4());
jfast(s.getBtn4());

ShopPojo s = new ShopPojo();
jfast(s.getDropDown());
jfast(s.getShop5());
jfast(s.getBtn5());

ShopPojo s = new ShopPojo();
jfast(s.getDropDown());
jfast(s.getBtn6());
jfast(s.getShop6());*/


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*QuizPojo d = new QuizPojo();
jfast(d.getQuizBtn());
jfast(d.getMyselfButton());
jfast(d.getNxtBtn());
jfast(d.getFst_btn());
jfast(d.getNxtBtn1());
jfast(d.getSecondBtn());
jfast(d.getNxtBtn2());
jfast(d.getThirdBtn());
jfast(d.getNxtBtn3());
jfast(d.getFourthBtn());
jfast(d.getNxtBtn4());
jfast(d.getResultBtn());
closeTheBrowser();*/

	/*CartPojo c = new CartPojo();
	jfast(c.getSearchbox());
passTheValues(c.getWriteIn(), "jasmine oil");
jfast(c.getItem1());
jfast(c.getAdd());*/
	
	/*PojoProject1 p = new PojoProject1();
	jfast(p.getRegister());
	passTheValues(p.getEmail(), "priya@gmail.com");
	passTheValues(p.getPassword(), "123");
	Clicking(p.getSignin());
	screenShot("login");
	driver.close();*/
	
}
}

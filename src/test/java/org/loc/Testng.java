package org.loc;

import java.util.concurrent.TimeUnit;

import org.edu.UtilityClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng extends UtilityClass{
	
	@BeforeTest
	
	public void tc1() {
		openChrome();
		openWebPage("https://www.saje.ca/");
		maxWindow();
		

	}
	
	
	@Test 
	(priority=2,dataProvider="login")
	public void tc2(String email,String pass) {
		PojoProject1 p = new PojoProject1();
		jfast(p.getRegister());
		passTheValues(p.getEmail(), email);
		passTheValues(p.getPassword(), pass);
	
		Clicking(p.getSignin());
		
		

	}
 @Test(priority=3)
 public void tc3() {
	 NewPojo p = new NewPojo();
	 jfast(p.getRegister());
	 jfast(p.getCreateNew());
	 passTheValues(p.getFst_Name(), "priyanka");
	 passTheValues(p.getLst_Name(), "dines");
	 passTheValues(p.geteMail(), "priyankadinesh@gmail.com");
	 passTheValues(p.getPassWord(), "deekshithdinesh@27");
	 jfast(p.getClickMonth());
	 jfast(p.getSelectMonth());
	 jfast(p.getClickYear());
	 jfast(p.getSelectYear());
	 jfast(p.getClickDay());
	 jfast(p.getSelectDay());
	 jfast(p.getCreate());
		
	

}

@DataProvider(name="login")
public String[][] getData() {
	
	
	
	String [][]data= {{"123@gmail.","%^^&&"},{"23.876","data@rewA"},
			{"priyankajayaraman1211996@gmail.com","!!@@"},{"priyankajayaraman1211996@gmail.com","priya"}
	};
	/*String[][]data =new String[4][2];
	data[0][0]="123@gmail.";//invalid username
	data[0][1]="%^^&&";//invalid password
   data[1][0]="23.876";//invalid username
  
data[1][1]="data@rewA";//valid password
data[2][0]="priyankajayaraman1211996@gmail.com";//valid username
data[2][1]="!!!@@";//invalid password
data[3][0]="priyankajayaraman1211996@gmail.com";//valid username
data[3][1]="deekshithdinesh@27";//valid password

return data;*/
	return data;
																
					
					
			
			
	
	
	
}
@Test(priority=1)
public void addtoCart() {

	CartPojo c = new CartPojo();
	jfast(c.getSearchbox());
passTheValues(c.getWriteIn(), "jasmine oil");
jfast(c.getItem1());
jfast(c.getAdd());
}
@Test
public void Quiz() 
{QuizPojo d = new QuizPojo();
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
	
	
}

@Test (groups= {"shop"})
public void shop1() {
	// TODO Auto-generated method stub
ShopPojo s = new ShopPojo();
	
	
	
	jfast(s.getDropDown());
jfast(s.getShop1());
jfast(s.getBtn1());

}
@Test (groups= {"shop"})
public  void shop2() {
	ShopPojo s = new ShopPojo();
	jfast(s.getDropDown());
	jfast(s.getShop2());
	jfast(s.getBtn2());
	// TODO Auto-generated method stub

}
@Test (groups= {"shop"})
public void shop3() {
	ShopPojo s = new ShopPojo();
	jfast(s.getDropDown());
	jfast(s.getShop3());
	jfast(s.getBtn3());
	// TODO Auto-generated method stub

}@Test(groups= {"shop"})
public  void shop4() {
	ShopPojo s = new ShopPojo();
	jfast(s.getDropDown());
	jfast(s.getShop4());
	jfast(s.getBtn4());
	// TODO Auto-generated method stub

}@Test(groups= {"shop"})
public  void shop5() {
	ShopPojo s = new ShopPojo();
	jfast(s.getDropDown());
	jfast(s.getShop5());
	jfast(s.getBtn5());
	// TODO Auto-generated method stub

}@Test(groups= {"shop"})
public void shop6() {
	ShopPojo s = new ShopPojo();
	jfast(s.getDropDown());
	jfast(s.getBtn6());
	jfast(s.getShop6());

}


	@AfterTest
	public void close() {
		// TODO Auto-generated method stub
driver.close();
	}
	// TODO Auto-generated method stub

}




package org.loc;

import org.edu.UtilityClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StorePojoTest extends UtilityClass {

	
	
	
@BeforeTest
	
	public void tc1() {
		openChrome();
		openWebPage("https://www.saje.ca/");
		maxWindow();
		

	}
  @Test
  public void checkHelp() {
   StorePojo s = new StorePojo();
   jfast(s.getHelpBtn());
   jfast(s.getContactBtn());
   jfast(s.getReturnBtn());
   
  }
  
  
 @Test private void findStore() {
	 StorePojo s = new StorePojo();
	 jfast(s.getStoreBtn());
	 passTheValues(s.getLocation(), "canada");
	 jfast(s.getRadius());
	 jfast(s.getSelectRadius());
	 jfast(s.getSelectMasurement());
	 jfast(s.getSearchBtn());
	 
	// TODO Auto-generated method stub

}
}



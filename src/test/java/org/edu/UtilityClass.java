package org.edu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	
	
	
	
	
	public static void openChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();
	}
		
		public static void openWebPage(String url) {
			
			driver.get(url);

		}
		public static void getTitle() {
			String y = driver.getTitle();
			System.out.println(y);
		}public static void currentUrl() {
			String x = driver.getCurrentUrl();
		System.out.println(x);
		}
		public static void closeTheBrowser() {
		driver.close();

		}
		public static void passTheValues(WebElement element,String value) {
			element.sendKeys(value);

		}
		public static void Clicking(WebElement element) {
			
			
		 element.click();
		}
		public static void copy() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			}
		public static void paste() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
		}
		  public static String getDataFromExcel(String exName,String shName,int r,int c) throws IOException
		  
		  {
		File f = new  File("C:\\Users\\Dinesh\\eclipse-workspace\\MavenProject\\testdata\\"+exName+".xlsx");
		FileInputStream a1 = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(a1);
		 Sheet s1 = book.getSheet(shName);
		 Row r1 = s1.getRow(r);
		 Cell c1 = r1.getCell(c);
		 
		 String s;
			
			
			if(c1.getCellType()==1)
			{
				
				 s = c1.getStringCellValue();
				System.out.println(s);
				
			}
			else if(DateUtil.isCellDateFormatted(c1))
			{
				
				Date d = c1.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("DD,MM-YYYY");
				s = sim.format(d);
				System.out.println(s);
			}else
			{
				double d = c1.getNumericCellValue();
				long l =(long) d;
				s = String.valueOf(l);
				System.out.println(s);
				
				
			}
			return s;
				
			}
		 public static void jfast(WebElement e) {
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", e);

		}
		 


public static void screenShot(String login) throws IOException {
	TakesScreenshot t = (TakesScreenshot) driver;
	File temp = t.getScreenshotAs(OutputType.FILE);
	
	File perm = new File ("C:\\Users\\Dinesh\\eclipse-workspace\\Project1\\screenshot"+login+".png");
	FileUtils.copyFile(temp, perm);
	
	System.out.println("Screenshot taken");
	
	// TODO Auto-generated method stub

}

public static void dbConnection(String query,String user,String password,int c1,String c2) 
		throws ClassNotFoundException, Exception {
	Connection con=null;
	
	//1.load the driver 		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.Set the connection to the database
	con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", user, password);
	//3.Write a sql query
	 PreparedStatement ps = con.prepareStatement(query);
	 ResultSet rs = ps.executeQuery();
	 

//iterate the results
while(rs.next()) {// table for course

System.out.println(c1=rs.getInt("CID"));
System.out.println(c2=rs.getString("CNAME"));			  
			  
}
{
 con.close();

}
}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



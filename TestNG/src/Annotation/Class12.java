package Annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import swaglab_DDF_01.SwagLabOpneMenuPage;
import swaglab_DDF_01.swagLabHomePage;
import swaglab_DDF_01.swagLabLoginPage;

public class Class12 
{
	WebDriver m = new ChromeDriver();
	

	@BeforeClass
	public void openBroswer()
	{
		Reporter.log("Opening Browser",true );

		m.get("https://www.saucedemo.com/");
		m.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void loginInSwagLAb() throws EncryptedDocumentException, IOException
	{
		FileInputStream sh = new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sht = WorkbookFactory.create(sh).getSheet("Sheet5");
		
		swagLabLoginPage login = new swagLabLoginPage(m);
		login.inpswagLabLoginPageUsername(sht.getRow(0).getCell(0).getStringCellValue());
		login.inpswagLabLoginPagepassword(sht.getRow(0).getCell(1).getStringCellValue());
		login.clickswagLabLoginPageLoginbutton();
	}
	
	
	@Test
	public void verifyLOg()
	{
		swagLabHomePage ho= new swagLabHomePage(m);
		ho.verifyswagLabHomePageLogo();
		ho.clickswagLabHomePageOpenmenu();
	}
	
	@AfterMethod
	public void logout()
	{
		SwagLabOpneMenuPage l = new SwagLabOpneMenuPage(m);
		l.clickswagLabMenuPageLogoutbutn();
	} 
	
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("closing browser",true);
		m.close();
	}
	
	

}

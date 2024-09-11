package Annotation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

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

public class Class10
{
	WebDriver m = new ChromeDriver();
	
	@BeforeClass
	public void openBroswer()
	{
		Reporter.log("Opening broswer",true);
		m.get("https://www.saucedemo.com/");
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void loginSwagLab() throws EncryptedDocumentException, IOException
	{
		swagLabLoginPage lo= new swagLabLoginPage(m);
		FileInputStream m = new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet5");
		lo.inpswagLabLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		lo.inpswagLabLoginPagepassword(sh.getRow(0).getCell(1).getStringCellValue());
		lo.clickswagLabLoginPageLoginbutton();
	}
	
	
	@Test
	public void verifylog()
	{
		swagLabHomePage n = new swagLabHomePage(m);
		n.verifyswagLabHomePageLogo();
		n.clickswagLabHomePageOpenmenu();
		
	}
	
	@Test(priority = 1)
	public void verifyRemovebutton() throws EncryptedDocumentException, IOException
	{
		
		
		swagLabHomePage l = new swagLabHomePage(m);
		FileInputStream m = new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet5");
		l.clickswagLabHomePageAddtocart();
		l.verifySwagLabHomePageRemove(sh.getRow(2).getCell(0).getStringCellValue());
		l.clickswagLabHomePageOpenmenu();
	}
	
	@AfterMethod
	public void logout()
	{
		SwagLabOpneMenuPage ml= new SwagLabOpneMenuPage(m);
		ml.clickswagLabMenuPageLogoutbutn();
	}
	@AfterClass
	public void closebrowser ()
	{
		m.close();
	}
}

package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import swaglab_DDF_01.swagLabHomePage;
import swaglab_DDF_01.swagLabLoginPage;

public class Class2
{
	@Test
	public void TC1() throws EncryptedDocumentException, IOException
	{
		
		
		Reporter.log("Test case 1 is running",true);
		FileInputStream file = new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		WebDriver m = new ChromeDriver();
		m.get("https://www.saucedemo.com/");
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		swagLabLoginPage ne= new swagLabLoginPage(m);
		
		ne.inpswagLabLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		ne.inpswagLabLoginPagepassword(sh.getRow(0).getCell(1).getStringCellValue());
		ne.clickswagLabLoginPageLoginbutton();
		
		m.close();
		

		
	}
	
	@Test
	public void TC2() throws EncryptedDocumentException, IOException
	{
		Reporter.log("Test case 2 is running",true);
		FileInputStream file = new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		WebDriver m = new ChromeDriver();
		m.get("https://www.saucedemo.com/");
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		swagLabLoginPage ne= new swagLabLoginPage(m);
		
		ne.inpswagLabLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		ne.inpswagLabLoginPagepassword(sh.getRow(0).getCell(1).getStringCellValue());
		ne.clickswagLabLoginPageLoginbutton();
		
		swagLabHomePage n= new swagLabHomePage(m);
		n.verifyswagLabHomePageLogo();
		n.clickswagLabHomePageOpenmenu();
		m.close();
		
		
		
	}

}

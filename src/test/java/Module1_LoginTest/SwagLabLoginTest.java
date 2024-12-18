package Module1_LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import Module1_Login.SwagLabOpenMenuPage;

public class SwagLabLoginTest extends BaseClass {
	
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	int TCID;
	
 
	@BeforeClass
	public void openBrowser()throws EncryptedDocumentException, IOException
	{
		
   
	    intializeBrowser(); //call the base class method
	    
	    
	     login=new SwagLabLoginPage(driver);
	     home=new SwagLabHomePage(driver);
	     menu=new SwagLabOpenMenuPage(driver);
	     
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		login.inpSwagLabUsername(UtilityClass.getPFData("UN"));
		login.inpSwagLabPassword(UtilityClass.getPFData("PWD"));
		login.clickSwagLabOnLoginBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogin() throws EncryptedDocumentException, IOException
	{
		//home.verifySwagLabLogo(sh.getRow(0).getCell(2).getStringCellValue());
		TCID=101;
		String actLogoText=home.getSwagLabLogoText();
		String expLogoText=UtilityClass.getTD(0, 2);
		Assert.assertEquals(actLogoText, expLogoText,"Failed:both results are different");
	} 

	//ITestResult-->interface 
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws InterruptedException, IOException
	{
		//code to capture screenshot
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
		home.clickSwagLabOnOPenMenu();
		Thread.sleep(2000);
		menu.clickSwagLabOnLogoutBtn();
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}

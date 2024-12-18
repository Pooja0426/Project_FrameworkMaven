package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class2
public class SwagLabHomePage {
	
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	public void verifySwagLabLogo(String expText)
//	{
//		
//		String actTitle= logo.getText();
//		String expTitle="Swag Labs";
//		
//		if(actTitle.equals(expTitle))
//		{
//			System.out.println("TC pass");
//		}
//		else
//		{
//			System.out.println("TC fail");
//		}
//		
//		
//	}
	
	public String getSwagLabLogoText()
	{
		String LogoText=logo.getText();
		return LogoText;
	}
	
	public void clickSwagLabOnOPenMenu()
	{
		openMenu.click();
	}
}

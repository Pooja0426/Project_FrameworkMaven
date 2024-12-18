package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class3
public class SwagLabOpenMenuPage {

	//Step1--> element as a variable decalare globally using private access specifier
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
	
	//step2--> initialize within constructor with access level public using pageFcatory class in initElements method
	
	public SwagLabOpenMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3---->utilize within method with access level public
	
	
	public void clickSwagLabOnLogoutBtn()
	{
		logout.click();
	}
	
	
}

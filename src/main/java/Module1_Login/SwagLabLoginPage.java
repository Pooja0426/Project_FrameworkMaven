package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//POM CLASS1
public class SwagLabLoginPage {
	
//Step1--> declared global variable access level private 	
 @FindBy(xpath="//input[@id='user-name']")	private WebElement username;  //private WebElement username=driver/.findElement(By.xpath("//input[@id='user-name']"))
 @FindBy(xpath="//input[@id='password']")	private WebElement password;
 @FindBy(xpath="//input[@id='login-button']")	private WebElement loginBtn;
	
 //step2-->initialize within constructor with access level public using PageFactory class
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}

	
	//step3--> utilize within method with access level public
	
	public void inpSwagLabUsername(String UN)
	{
		username.sendKeys(UN);
	}
	
	
	public void inpSwagLabPassword(String Pwd)
	{
		password.sendKeys(Pwd);
	}
	
	
	public void clickSwagLabOnLoginBtn()
	{
		loginBtn.click();
	}
	

}

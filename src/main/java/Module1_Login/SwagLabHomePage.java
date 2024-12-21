package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class2
public class SwagLabHomePage {
	
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	@FindBy(xpath="//a[@id='item_2_title_link']")private WebElement onesieProduct;
	@FindBy(xpath="(//div[@class=\"inventory_item_price\"])[5]") private WebElement onesieProductPrice;
	@FindBy(xpath="(//button[text()='Add to cart'])[5]") private WebElement onesieProductAddToCart;
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	public String getSwagLabLogoText()
	{
		String LogoText=logo.getText();
		return LogoText;
	}
	
	public void clickSwagLabOnOPenMenu()
	{
		openMenu.click();
	}
	
	public String getSwagLabHomePageOnesieProduct()
	{
		String actText=onesieProduct.getText();
		return actText;
		
	}
	
	public double getSwagLabHomePagePriceProduct()
	{
		String productPrice=onesieProductPrice.getText(); //$7.99
		 productPrice=productPrice.substring(1);    //7.99
		 double productInDouble=Double.parseDouble(productPrice);  //String->Double convert
		return productInDouble;
		
	}

	public void getSwagLabHomePageOnesieProductAddToCart() {
		onesieProductAddToCart.click();
	}
}

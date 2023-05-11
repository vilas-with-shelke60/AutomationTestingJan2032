package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase1;

public class LoginPage1 extends TestBase1 {
	//to initialization webelement
	public LoginPage1()
	{
		PageFactory.initElements(driver, this);
	}
	//webelement repository
	
	@FindBy(name="username")
	WebElement usernametxtBox;
	
	@FindBy(name="password")
	WebElement passwordtxtBox;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;

	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	WebElement logo;
	
	@FindBy(linkText="Sign Up")
	WebElement SignUpLink;
	
	//Action
	public HomePage login() {
		usernametxtBox.sendKeys(prop.getProperty("username"));
		passwordtxtBox.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		
		
		//HomePage object1 = new HomePage();
	    //return object1;
		
		return new HomePage();
	}
	public boolean logoStatus() {
		
		boolean status=logo.isDisplayed();
		return status;
	}
   public boolean linkStatus() {
		
		boolean status=logo.isDisplayed();
		return status;
		
	}
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase1;

public class DemoPage extends TestBase1 {
	
  //to initialized element
	
	public void DemoPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	//webelement
	@FindBy(linkText="Upgrade your account")
	WebElement logo;
	
	//Action
	public boolean logodisplay() {
		
		boolean status = logo.isDisplayed();
		return status;
	}
	
}

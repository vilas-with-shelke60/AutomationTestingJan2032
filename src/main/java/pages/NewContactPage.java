package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase1;

public class NewContactPage extends TestBase1 {
	
	//TO initialiate element
	public NewContactPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	//webelements repository
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(id="mobile")
	WebElement MobileNr;
	
	@FindBy(name="address")
	WebElement address;
	
	
	@FindBy(xpath="//input[@value='Save']")//used:axes xpath
	WebElement savebtn;
	
	//actions
	public void createNewContact(String FN,String LN,String MobNr,String Address ) {
		firstName.sendKeys(FN);
		lastName.sendKeys(LN);
		MobileNr.sendKeys(MobNr);
		address.sendKeys(Address);
		savebtn.click();
	}

}

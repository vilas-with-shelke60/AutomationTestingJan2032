package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase1;
import utility.Util;

public class HomePage extends TestBase1{
	//to initialization web element
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//webElement repository
	@FindBy(xpath="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement user;
	
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
	WebElement logoutbtn;
	
	@FindBy(xpath="//td[text()='CRMPRO']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contacts;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement newContacts;
	
	@FindBy(xpath="//a[text()='Companies']")
	WebElement Company;
	
	@FindBy(xpath="//a[text()='New Company']")
	WebElement newCompany;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement deal;
	
	@FindBy(xpath="//a[text()='New Deal']")
	WebElement newdeal;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement task;
	
	@FindBy(xpath="//a[text()='New Task']")
	WebElement newtask;
	
	//Actions
	public String userCheck() {
		Util.switchToMainPanelFrame();
		String username =user.getText();
		return username;
	}
   public void logout() {
	   Util.switchToMainPanelFrame();
	   logoutbtn.click();
	}
   public boolean logoCheck() {
	   Util.switchToMainPanelFrame();
	   boolean status = logo.isDisplayed();
	   return status;
	}
   public NewContactPage newContact() {
		
	   Util.switchToMainPanelFrame();
	   Util.mouseHoverAction(contacts);
		newContacts.click();
		 return new NewContactPage();
		
  	}
   public void createCompany() {
	   
	   Util.switchToMainPanelFrame();
	   Util.mouseHoverAction(Company);
		newCompany.click();
   }
  public void createDeal() {
	   
	  Util.switchToMainPanelFrame();
	  Util.mouseHoverAction(deal);
		newdeal.click();
   }
  public void createTask() {
	   
	  Util.switchToMainPanelFrame();
		Util.mouseHoverAction(newtask);
		newtask.click();
  }

}
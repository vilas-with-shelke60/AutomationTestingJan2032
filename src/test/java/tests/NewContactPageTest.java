package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import base.TestBase1;
import pages.HomePage;
import pages.LoginPage1;
import pages.NewContactPage;
import utility.ReadData;

public class NewContactPageTest extends TestBase1 {
	
	HomePage homePage;
	NewContactPage newContactPage;
	
	@BeforeMethod
	public void initialization() {
		
		TestBase1.init();//init() or testbase1.init() both are same becz we declared static
		LoginPage1 loginPage = new LoginPage1();
		 homePage =loginPage.login();
		 newContactPage=homePage.newContact();
		
	}
	
	@DataProvider(name="ContactData")
	public String[][] passData()
	{
		return ReadData.testData();
	}
	
	@Test(dataProvider="ContactData")
	public void validateCreateContact(String FirstName,String LastName ,String MobileNumber,String Address) {
		
		//homePage.newContact();
		newContactPage.createNewContact(FirstName,LastName,MobileNumber,Address);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}

}

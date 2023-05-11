package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase1;

import pages.LoginPage1;

public class LoginPageTest1 extends TestBase1 {

	LoginPage1 loginPage;
	
	@BeforeMethod
	public void initialization()  {
		
		init();
		loginPage = new LoginPage1();
		
	}
	@Test
	public void validateLoginTest()
	{
		loginPage.login();
	}
	@Test
	public void validateLogoTest()
	{
		boolean actualStatus =loginPage.logoStatus();
		Assert.assertEquals(actualStatus,true);
	}
	@Test
	public void validateLinkTest()
	{
		boolean actualStatus =loginPage.linkStatus();
		Assert.assertTrue(actualStatus);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}

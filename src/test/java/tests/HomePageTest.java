package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import base.TestBase1;
import pages.HomePage;
import pages.LoginPage1;

public class HomePageTest extends TestBase1{
	
	HomePage homePage;

	@BeforeMethod
	public void initialization() {
		
		init();
		LoginPage1 loginPage = new LoginPage1();
		//loginPage.login();
		homePage=loginPage.login();
	}
	
	@Test
	public void validateUserTest() {
		
		homePage.userCheck();
	}
	@Test
	public void validateLogoutTest() {
		
		homePage.logout();
	}
	@Test
	public void validateHomePageLogoTest() {
		
		homePage.logoCheck();
	}
	@Test
	public void validateRedirectionCreateContactTest() {
		
		homePage.newContact();
	}
	@Test
	public void validateRedirectionOfCreateCompanyTest() {
		
		homePage.createCompany();
	}
	@Test
	public void validateRedirectionOfCreateDealTest() {
		
		homePage.createDeal();
	}
	@Test
	public void validateRedirectionOfCreateTaskTest() {
		
		homePage.createTask();
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
}


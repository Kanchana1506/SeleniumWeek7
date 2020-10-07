package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginLogout extends BaseClass {
	
	@Test
	public void runloginlogout()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("demosalesmanager")
		.enterpassword("crmsfa")
		.clicklogin()
		.clicklogout();
	}

}

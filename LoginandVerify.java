package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginandVerify extends BaseClass {
	
	@BeforeTest
	public void setfile()
	{
		filename = "login";
	}
	
	
	@Test(dataProvider = "fetchdata")
	public void runloginandverify(String username,String password)
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(username)
		.enterpassword(password)
		.clicklogin();
		
	}


}

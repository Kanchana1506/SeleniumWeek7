package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.CreateLeadPage;
import pages.EditLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;

public class CreateLead extends BaseClass{
	
	@Test
	public void runcreatelead() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("demosalesmanager")
		.enterpassword("crmsfa")
		.clicklogin();
		
		HomePage hm = new HomePage(driver);
		hm.clickcrmsfa();
				
		MyHomePage hp = new MyHomePage(driver);
		hp.leadstab();
		
		MyLeadsPage mlp = new MyLeadsPage(driver);
		mlp.createlead();
				
		CreateLeadPage cl = new CreateLeadPage(driver);
		cl.enterfrstname("ktest65");
		cl.enterlastname("testing");
		cl.entercmpnyname("TEST");
		cl.clickcreate();
		
		ViewLeadPage vlp = new ViewLeadPage(driver);
		vlp.viewlead();
				
	}
}

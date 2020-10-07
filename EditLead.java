package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.EditLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;

public class EditLead extends BaseClass {

	@Test
	public void runeditlead() throws InterruptedException
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
		mlp.findlead();
		
		EditLeadPage el = new EditLeadPage(driver);
		el.fname();
		el.fleadclick();
		el.firstlead();
		el.clickedit();
		el.clear();
		el.cmpnyname();
		el.updateclick();
	
		ViewLeadPage vlp = new ViewLeadPage(driver);
		vlp.chngedname();
	}
}

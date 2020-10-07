package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public void viewlead()
	{
		String Leadtitle = driver.getTitle();
		System.out.println (Leadtitle);

	}

	public void chngedname() throws InterruptedException
	{
		//Thread.sleep(2000);
		//String newcmpname = driver.findElementById("viewLead_companyName_sp").getText();
		String newcmpname = driver.findElementById(prop.getProperty("viewlead.newname.id")).getText();
		
		System.out.println("old company name is " + oldcmpny );
		  System.out.println("new company name in view lead page is: " + newcmpname );
		  Thread.sleep(2000);
		  if ( oldcmpny.equals(bb)) 
			 { System.out.println ("name is not changed");} 
			 else
			 {System.out.println ("name is changed"); 
			 System.out.println("new name of the company is : "+ newcmpname);
			 }
}
}
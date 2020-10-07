package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterfrstname(String fname)
	{
	//	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById(prop.getProperty("createLead.firstname.id")).sendKeys(fname);
	}
	
	public void enterlastname(String lname)
	{
//		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementById(prop.getProperty("createlead.lastname.id")).sendKeys(lname);
	}
	
	public void entercmpnyname(String cmp)
	{
		//driver.findElementById("createLeadForm_companyName").sendKeys(cmp);
		driver.findElementById(prop.getProperty("createlead.companyname.id")).sendKeys(cmp);
	}
	
	public void clickcreate()
	{
//		driver.findElementByName("submitButton").click();
		driver.findElementByXPath(prop.getProperty("createlead.submit.xpath")).click();
		
	}

}

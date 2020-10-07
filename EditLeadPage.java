package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public void fname()
	{
		//driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("ktest21");
		driver.findElementByXPath(prop.getProperty("findlead.fname.xpath")).sendKeys("ktest6");
	}
	
	
	public void fleadclick() throws InterruptedException
	{
		//driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath(prop.getProperty("findlead.flead.xpath")).click();
		Thread.sleep(2000);
	}
	
	
	public void firstlead()
	{
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath(prop.getProperty("findlead.frstlead.xpath")).click();
	}
	
/*	
	public void title()
	{
		System.out.println("title of the page is : " + driver.getTitle());
	}
	*/
	
	public void clickedit()
	{
		//driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath(prop.getProperty("findlead.findlead.xpath")).click();
	}
	
	
	public void clear()
	{
	 oldcmpny = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
//		System.out.println("old company name is " + oldcmpny );
		driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		  driver.findElementById("updateLeadForm_companyName").clear();
		
	}
	
	
	public void cmpnyname()
	{
		  bb= "Laks tech";
		  driver.findElementById("updateLeadForm_companyName").sendKeys(bb);
		  //System.out.println("new company name provided is " + bb );
	}
	
	
	public void updateclick()
	{
		driver.findElementByXPath("//input[@type=\"submit\"][@value=\"Update\"]").click();
	}
}

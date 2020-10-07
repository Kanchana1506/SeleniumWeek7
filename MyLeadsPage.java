package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass  {
	
public MyLeadsPage(ChromeDriver driver)
{
	this.driver = driver;
	}

public void createlead()
{
	//driver.findElementByLinkText("Create Lead").click();
	driver.findElementByXPath(prop.getProperty("MyLeadsPage.createlead.link")).click();
}

 
public void findlead()
{
	driver.findElementByLinkText("Find Leads").click();
} 
 
}

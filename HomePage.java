package pages;

import base.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage clickcrmsfa()
	{
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath(prop.getProperty("Homepage.link.id")).click();
		return new HomePage(driver);	
	}
	
	public LoginPage clicklogout()
	{
		driver.findElementByXPath(prop.getProperty("Homepage.logout.xpath")).click();
		//driver.findElementByClassName(prop.getProperty("Homepage.logout.xpath")).click();
		return new LoginPage(driver);
	}
	
}

package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import cucumber.api.java.en.And;

public class MyHomePage extends BaseClass {
	
	public MyHomePage(ChromeDriver driver)
		{
		this.driver = driver;
		}

	public void leadstab() 
	{
		//driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath(prop.getProperty("MyHomePage.Leadstab.link")).click();
	}
	
	
	
	
}

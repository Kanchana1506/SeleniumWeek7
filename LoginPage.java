package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
		
	public LoginPage enterusername(String uname)
	{
		driver.findElementById(prop.getProperty("Login.username.id")).sendKeys(uname);
		return this;
	}
	

	public LoginPage enterpassword(String pwd)
	{
		driver.findElementById(prop.getProperty("Login.password.id")).sendKeys(pwd);
		return this;
	}
	
	public HomePage clicklogin()
	{
		driver.findElementByClassName(prop.getProperty("Login.submit.classname")).click();
		return new HomePage(driver);
	}

}

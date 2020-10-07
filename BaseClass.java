package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	public static String oldcmpny,bb;
	public String filename;
	public static Properties prop;

	@Parameters({"language"})
	@BeforeTest
	public void proplead(String lang) throws Exception 
	{
	FileInputStream fis = new FileInputStream("./src\\main\\resources\\"+lang+".properties");
	prop = new Properties();
	prop.load(fis);
	
	}
	
	
	@DataProvider(name="fetchdata") 
	public String[][] SendData() throws IOException
	 { 
		return ReadExcel.exceldata(filename); 
		}
	 
	
	@BeforeMethod
	public void precond()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	
	 @AfterMethod 
	 public void postcond() 
	 { driver.close(); }
	

}

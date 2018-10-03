package ca.goucher.adam.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ca.goucher.adam.qa.util.TestUtil;


public class TestBase {
	protected static WebDriver driver;
	protected static Properties prop;
	//initialize all properties
	public TestBase() {
		//first, read in the properites from the config.properties file
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/hanschehaiber/eclipse-workspace/ParkingCalculatorTest/"
					+ "src/main/java/ca/goucher/adam/qa/config/config.properties");
			prop.load(ip);
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("FireFox")) {
			//configure and engage WebDriver
			System.setProperty("webdriver.gecko.driver","//Users//hanschehaiber//geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,  TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}

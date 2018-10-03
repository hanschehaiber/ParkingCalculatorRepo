package ca.goucher.adam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ca.goucher.adam.qa.base.TestBase;
import ca.goucher.adam.qa.pages.ParkingCalculatorPage;

public class ParkingCalculatorPageTest extends TestBase{

	ParkingCalculatorPage parkingCalculatorPage;
	
	public ParkingCalculatorPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		parkingCalculatorPage = new ParkingCalculatorPage();
	}
	
	@Test(priority = 1)
	public void verifyParkingCalculatorPageTitle() {
		String title = parkingCalculatorPage.getParkingCalculatorPageTitle();
		Assert.assertEquals(title, "Parking Calculator");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}

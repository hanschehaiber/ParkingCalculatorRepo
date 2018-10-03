package ca.goucher.adam.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ca.goucher.adam.qa.base.TestBase;

public class ParkingCalculatorPage extends TestBase{

	//Page Factory (Object Repository)
	@FindBy(id="EntryTime")
	WebElement entryTime;
	
	public ParkingCalculatorPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getParkingCalculatorPageTitle() {
		return driver.getTitle();
	}
	
	
	
}

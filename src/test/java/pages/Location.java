package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class Location extends WebTestBase {
	
	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[2]/div[5]/img")
	WebElement location;
	
	@FindBy(xpath = "/html/body/div/main/div[5]/div/div[2]/div[2]/div[3]/div[2]/div/div/div/input")
	WebElement pincode;
	
	@FindBy(xpath = "/html/body/div/main/div[5]/div/div[3]/div")
	WebElement search;
	
	public Location()

	{
		PageFactory.initElements(driver, this);
	}
	public void location_btn() throws AWTException {
		location.click();
		pincode.sendKeys("600026");
		search.click();
	}
}

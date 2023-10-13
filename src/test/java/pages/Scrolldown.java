package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;
import testBase.WebTestBase;

public class Scrolldown extends WebTestBase {
	@FindBy(xpath = "/html/body/div/main/div[3]/div/div/p/a[2]/span/img")
	WebElement express;
	
	@FindBy(xpath = "/html/body/div/main/div[5]/article/div[2]/div[2]/div/div/div/ul/li[1]/button/span/span")
	WebElement price;
	
	
	public Scrolldown()
	{
		PageFactory.initElements(driver, this);
	}
	public void scrolldown() throws InterruptedException {
		express.click();
		Thread.sleep(2000);
		price.click();
		Thread.sleep(2000);
		Utility.scrollingdown(driver, express);
		Thread.sleep(2000);
		Utility.scrollingdown(driver, express);
		Thread.sleep(2000);
		Utility.scrollingdown(driver, express);
		Thread.sleep(2000);
		Utility.scrollingdown(driver, express);
		
	}

}

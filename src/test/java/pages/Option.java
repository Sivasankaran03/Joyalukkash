package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class Option extends WebTestBase {

	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[2]/div[6]/button/div/img")
	WebElement dot;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[3]")
	WebElement goldrate ;
	
	@FindBy(xpath="/html/body/div/main/div[5]/div/div/div[1]/div/span/button[1]")
	WebElement retail;
	
	
	public Option()
	{
		PageFactory.initElements(driver, this);
	}
	public void option_btn() throws InterruptedException {
		dot.click();
		Thread.sleep(2000);
		goldrate.click();
		Thread.sleep(2000);
		retail.click();
	}
}

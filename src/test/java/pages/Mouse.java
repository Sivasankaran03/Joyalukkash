package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;
import testBase.WebTestBase;

public class Mouse extends WebTestBase {
	
	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[1]/div[3]/div/div/ul/li[1]/a/span")
	WebElement jewellery;
	
	@FindBy(xpath="/html/body/div/main/header/div[1]/div[1]/div[3]/div/div/ul/li[2]/a")
	WebElement wedding;
	
	@FindBy(xpath="/html/body/div/main/header/div[1]/div[1]/div[3]/div/div/ul/li[3]/a/span")
	WebElement gift;
	
	@FindBy(xpath ="/html/body/div/main/header/div[1]/div[1]/div[3]/div/div/ul/li[4]")
	WebElement action;
	
	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[1]/div[3]/div/div/ul/li[5]/a/span")
	WebElement promotion;
	
	public Mouse()
	{
		PageFactory.initElements(driver, this);
	}
	public void mousehover() throws InterruptedException {
	Utility.mouseOnHover(driver, jewellery);
	Thread.sleep(3000);
	Utility.mouseOnHover(driver, wedding);
	Thread.sleep(3000);
	Utility.mouseOnHover(driver, gift);
	Thread.sleep(3000);
	action.isSelected();
	Thread.sleep(3000);
	Utility.mouseOnHover(driver, action);
	promotion.isDisplayed();
	Thread.sleep(3000);
	Utility.mouseOnHover(driver, promotion);
	
}
}

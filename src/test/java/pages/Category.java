package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;
import testBase.WebTestBase;

public class Category extends WebTestBase {
	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[1]/div[3]/div/div/ul/li[3]/a/span")
	WebElement all;
	
	@FindBy(xpath= "/html/body/div/main/div[5]/article/div[2]/div[4]/img")
	WebElement filter;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/ul/li[10]/button/span/span[1]")
	WebElement earring;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/ul/li[10]/form/ul/li[5]/label/input")
	WebElement box;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button")
	WebElement apply;
	public  Category()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void category() throws InterruptedException
	{
		all.click();
		Utility.scrollingdown(driver, filter);
		filter.click();
		Thread.sleep(4000);
		earring.click();
		Thread.sleep(2000);
		box.click();
		Thread.sleep(2000);
		apply.click();
		Thread.sleep(2000);
	}
	
	}

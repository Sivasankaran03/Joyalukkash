package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import testBase.WebTestBase;

public class Search extends WebTestBase {
	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[2]/div[2]/div/div/form/div[2]/span/span[1]/input")
	WebElement Search;
	
	public Search()
	{
		PageFactory.initElements(driver, this);
	}
	public void method() throws InterruptedException {
		Search.sendKeys("Ring");
		Search.submit();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(driver.getTitle(),"Ring - Joyalukkas Search");
 		softassert.assertAll();
	}
	}

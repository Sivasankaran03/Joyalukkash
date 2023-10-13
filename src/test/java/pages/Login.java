package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import testBase.WebTestBase;

public class Login extends WebTestBase {  
	
	@FindBy(xpath ="/html/body/div/main/div[5]/div/div/div[1]/div/form/div[3]/span/span/span[1]/input")
	WebElement emailid;
	
	@FindBy(xpath= "/html/body/div/main/div[5]/div/div/div[1]/div/form/div[4]/div/span/span[1]/input")
	WebElement password;
	
	@FindBy(xpath= "/html/body/div/main/div[5]/div/div/div[1]/div/form/div[6]/button/span")
	WebElement Login_btn;
	
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login_click() throws InterruptedException
	{
		emailid.sendKeys(prop.getProperty("Emailid"));
		Thread.sleep(2000);
		password.sendKeys(prop.getProperty("Password"));
		Thread.sleep(2000);
		Login_btn.click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(driver.getTitle(),"Joyalukkas");
 		softassert.assertAll();
	}
	
}
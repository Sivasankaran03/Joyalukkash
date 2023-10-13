package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;
import testBase.WebTestBase;

public class Cart extends WebTestBase {
	@FindBy(xpath = "/html/body/div/main/header/div[1]/div[2]/div[2]/div/div/form/div[2]/span/span[1]/input")
	WebElement search_btn;
	
	@FindBy(xpath= "/html/body/div/main/div[5]/article/div[3]/section/div/div/div[2]/a")
	WebElement chain_btn;
	
	@FindBy(xpath="//button[@class='productFullDetail-actionsCart-hBt h-[40px] sm_h-[50px] text-md lg_text-xl sm_text-[20px] flex justify-center items-center xxxsm_text-sm rounded-full w-[150px] lg_w-[210px] md_w-[200px] sm_w-[200px] xxxsm_w-[230px] mt-[2%] sm_mt-[0%]']")
	WebElement add;
	
	
	public Cart()

	{
		PageFactory.initElements(driver, this);
	}
	public void cart() throws AWTException {
search_btn.sendKeys("chain");
search_btn.submit();
Utility.manualenter(driver);
chain_btn.click();
add.click();
	}
}


package testCase;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Option;
import pages.Scrolldown;
import pages.Cart;
import pages.Login;
import pages.Mouse;
import pages.Search;
import pages.Location;
import pages.Category;
import pages.Delivery;
import testBase.WebTestBase;

public class Tc01 extends WebTestBase {
	
	Login login;
	Search search;
	Cart cart;
	Location location;
	Category category;
	Option option;
	Delivery delivery;
	Scrolldown scrolldown;
	Mouse mouse;
	
	public Tc01()
	{
		super();
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		initialization();
		login = new Login();
		search = new Search();
		cart = new Cart();
		location = new Location();
		category = new Category();
		option = new Option();
        delivery = new Delivery();
        scrolldown = new Scrolldown();
        mouse = new Mouse();
	}
	@Test
	public void login_testcase() throws InterruptedException
	{
		SoftAssert softassert = new SoftAssert();
		login.login_click();
	}	
	@Test
	public void search_testcase() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();	
		login.login_click();
		search.method();
	}
	
	@Test
	public void cart_testcase() throws InterruptedException, AWTException {
		SoftAssert softassert = new SoftAssert();	
		login.login_click();
		cart.cart();
	}
	@Test
	public void Location_testcase() throws InterruptedException, AWTException {
		SoftAssert softassert = new SoftAssert();	
		login.login_click();
		location.location_btn();       
}
	@Test
	public void Category_testcase() throws InterruptedException {
	SoftAssert softassert = new SoftAssert();
	login.login_click();
	category.category();
}
	@Test
	public void Option_testcase() throws InterruptedException {
	SoftAssert softassert = new SoftAssert();
	login.login_click();
	option.option_btn();
	}
	
	@Test
	public void Delivery_testcase() throws InterruptedException {
	SoftAssert softassert = new SoftAssert();
	login.login_click();
	delivery.exp();
}
	@Test
	public void ScrollDown_testcase() throws InterruptedException {
	SoftAssert softassert = new SoftAssert();
	login.login_click();
	scrolldown.scrolldown();
}
	@Test
	public void Mouse_testcase() throws InterruptedException {
	SoftAssert softassert = new SoftAssert();
	login.login_click();
	mouse.mousehover();	
}
}
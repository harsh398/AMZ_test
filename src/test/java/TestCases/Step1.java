package TestCases;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.support.PageFactory;


import PageObjects.PageObjectFile;
import TestModules.LoginTest;
import Utilities.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
public class Step1  {
	public static WebDriver driver;

	 public List<HashMap<String,String>> datamap;
	 public Step1()
   {
   	driver =Hooks.driver;
   	datamap = DataHelper.data();
   }

	@Given("^User is on the main webpage$")
	public void user_is_on_the_main_webpage() throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);
		LoginTest.A(driver,datamap);

	}

	@When("^User enters valid email and password$")
	public void user_enters_valid_email_and_password() throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);
		LoginTest.B(driver,datamap);
	}

	@Then("^User is presented with the homepage$")
	public void user_is_presented_with_the_homepage() throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);


		LoginTest.C(driver,datamap);
	}
}
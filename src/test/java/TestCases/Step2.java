package TestCases;
import java.util.HashMap;
import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import TestModules.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.PageObjectFile;
import Utilities.DataHelper;
import org.openqa.selenium.WebDriver;
public class Step2 {
	public static WebDriver driver;
	 public List<HashMap<String,String>> datamap;    
	 public Step2()
	    {
			driver =Hooks.driver;

	    	datamap = DataHelper.data();
	    }


	@Given("^User is on the homepage$")
	public void user_is_on_the_homepage()throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);
		Search.D(driver,datamap);
	}

	@When("^User search for the product$")
	public void user_search_for_the_product() throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);

		Search.E(driver,datamap);
	}

	@When("^Selects the product$")
	public void selects_the_product()throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);

		Search.F(driver,datamap);


	}

	@Then("^Adds the product to the cart$")
	public void adds_the_product_to_the_cart()throws Exception {
		PageFactory.initElements(driver, PageObjectFile.class);
		Search.G(driver,datamap);


	}

}


package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.RetailMacObj;
import utilities.WebDriverUtility;

public class RetailMacStepDefinition extends Base{

	
			RetailMacObj MacBookPro = new RetailMacObj();
	
	
			@Given("^User is on the retail Webpage$")
			public void user_is_on_the_retail_Webpage() throws Throwable {
				MacBookPro.getURL();
				logger.info("User is on the retail webpage");
				WebDriverUtility.screenShot();
				
			}

			@Then("^User Search \"([^\"]*)\"$")
			public void user_Search(String value) throws Throwable {
				MacBookPro.enterValueToSearchBar(value);
				logger.info("User Entered the MacBook Pro in the search bar");
				WebDriverUtility.screenShot();
			}

			@Then("^User click the search button$")
			public void user_click_the_search_button() throws Throwable {
				MacBookPro.clickOnSearchButton();
				logger.info("User Clicked on the Search bar button");
				WebDriverUtility.screenShot();
				
				
			}

			@Then("^User should see the MacBook Pro image$")
			public void user_should_see_the_MacBook_Pro_image() throws Throwable {
				Assert.assertTrue(MacBookPro.imageIsDisplayed());
				logger.info("Image is displayed");
				WebDriverUtility.screenShot();
				
				
			}
	
}

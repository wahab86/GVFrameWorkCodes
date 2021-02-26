package stepDefinitions;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.mongodb.diagnostics.logging.Logger;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {

	
	
			// In this class we will write actual Java/Selenium codes associated to each Scenario steps
	
	
			RetailPageObj retailPage = new RetailPageObj();
			
			
			@When("^User search for '(.+)'$")
			public void user_search_for(String value) throws Throwable {
				retailPage.enterValueToSearchBar(value);
				logger.info("User entered value in search bar");
				WebDriverUtility.screenShot();
				
				
			}

			
			@When("^User click on search button$")
			public void user_click_on_search() throws Throwable {
				retailPage.clickOnSearchButton();
				logger.info("User clicked on search button");
				
			}

			
			
			@Then("^User should see iPhone image$")
			public void user_should_see_iPhone_image() throws Throwable {
				Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
				WebDriverUtility.screenShot();
				logger.info("iPhone image is displayed");
			    
				
			}

			
			@Given("^User is on Retail Website$")
			public void user_is_on_Retail_Website() throws Throwable {
			  
				
				
				
			}

			@When("^User click on MyAccount$")
			public void user_click_on_MyAccount() throws Throwable {
				
				
			  
			}

			@When("^User  click on register option$")
			public void user_click_on_register_option() throws Throwable {
				retailPage.clickOnRegister();
				logger.info("User  click on register option");
				
			    
			}

			@When("^User fill the registration form with below information$")
			public void user_fill_the_registration_form_with_below_information(DataTable personalInfo) throws Throwable {
				List<Map<String, String>>  dataValue = personalInfo.asMaps(String.class, String.class);
				
				retailPage.enterFirstName(dataValue.get(0).get("firstName"));
				retailPage.enterLastName(dataValue.get(0).get("lastName"));
				retailPage.enterEmail(dataValue.get(0).get("email"));
				retailPage.enterTelephone(dataValue.get(0).get("telephone"));
				retailPage.enterPassword(dataValue.get(0).get("password"));
				retailPage.enterConfirmPassword(dataValue.get(0).get("confirmPassword"));
				retailPage.Subscribe(dataValue.get(0).get("subscribe"));
				
				logger.info("User Filled the information form");
				WebDriverUtility.screenShot();
				  
			}

			@When("^User accept the privacy and policy$")
			public void user_accept_the_privacy_and_policy() throws Throwable {
				retailPage.checkPrivacyPolicy();
				logger.info("User Check privacy and policy");
				WebDriverUtility.screenShot();
				
				
			   
			}

			@When("^User click on continue button$")
			public void user_click_on_continue_button() throws Throwable {
				retailPage.clickOnContineButton();
				logger.info("User Clicked on Continue Button");
					
			    
			}

			@Then("^User should be registered in retail website$")
			public void user_should_be_registered_in_retail_website() throws Throwable {
				Assert.assertTrue(retailPage.registerationOutCome());
				WebDriverUtility.screenShot();
				logger.info("Account was Created Sucessfully");
				
				
			}
			
			
	
}

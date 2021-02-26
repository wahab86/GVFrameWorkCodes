package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailMacObj extends Base {

		
			public RetailMacObj() {
				PageFactory.initElements(driver, this);
			}
			
			
		@FindBy(xpath="//input[@name='search']")
		private WebElement SearchBar;
			
		
		@FindBy(xpath="//i[@class='fa fa-search']")
		private WebElement ClickButton;
		
		
		@FindBy(xpath = "//img[@alt='MacBook Pro']")
		private WebElement ImageIsDisplayed;
		
		
		
		public void enterValueToSearchBar(String Value) {
			WebDriverUtility.enterValue(SearchBar, Value);
			
		}
		
		
		public void clickOnSearchButton() {
			WebDriverUtility.clickOnElement(ClickButton);
			
		}
		
		
		public boolean imageIsDisplayed() {
			
			if (ImageIsDisplayed.isDisplayed())
				return true;
			
			else 
				return false;
			
		}
		
	
}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base{

		// Once we create page obj, we need to extends the base class to use parent
		// class properties such as WebDriver Drive
	
		// We create a constructor and inside the constructor we define the PageFactory.initEelement
		// method to initialize the WebElement in this page
	
		
		public RetailPageObj() {
			
			PageFactory.initElements(driver, this);
			
		}
	
		// We need to store UI WebElements in a private WebElement using @FindyBy annotation of PageFactor Class
		
		
		@FindBy(xpath="//*[@id=\"search\"]/input")
		private WebElement searchBar;
		
		
		@FindBy(xpath ="//i[@class='fa fa-search']") 
		private WebElement SearchButton;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
		private WebElement iPhoneImage;
		
		
		// WebElements for Register Account page
		
		
		@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
		private WebElement RegisterOption;
		
		@FindBy(xpath = "//input[@id='input-firstname']")
		private WebElement firstNameField;
		
		@FindBy (xpath = "//input[@id='input-lastname']")
		private WebElement lastNameField;
		
		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement emailField;
		
		@FindBy(xpath = "//input[@id='input-telephone']")
		private WebElement telephoneField;
		
		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement passwordField;
		
		@FindBy(xpath = "//input[@id='input-confirm']")
		private WebElement confirmPasswordField;
		
		@FindBy(xpath = "(//input[@value= '1'])[1]")
		private WebElement yesSubscribeButton;
		
		@FindBy(xpath= "(//input[@value= '0'])[1]")
		private WebElement noSubscribeButton;
		
		@FindBy(xpath ="//input[@type='checkbox']")
		private WebElement privacyPolicyCheckBox;
		
		@FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
		private WebElement continueButton;
		
		@FindBy(xpath= "//h1[text()= 'Your Account Has Been Created!']")
		private WebElement accountCreatedMessage;
		
		

		
		
		// We need to create public methods to perform required actions on each elements we stored.
		
		
		public void enterValueToSearchBar(String value) {
			WebDriverUtility.enterValue(SearchButton, value);
			
		}
		
		public void clickOnSearchButton() {
			WebDriverUtility.clickOnElement(SearchButton);
		}		
		
		
		public boolean iPhoneImageIsDisplayed() {
			
			if (iPhoneImage.isDisplayed())
				return true;
			else 
				return false;
			
			
		}
		
		
		// We need to create methods to perform on each WebElement
		
		
		public void clickOnRegister() {
			WebDriverUtility.clickOnElement(RegisterOption);
			
			
		}
		
		
		public void enterFirstName(String fName) {
			
			WebDriverUtility.enterValue(firstNameField, fName);
		}
		
		public void enterLastName(String lName) {
			WebDriverUtility.enterValue(lastNameField, lName);
			
		}
		
		public void enterEmail(String Email) {
			WebDriverUtility.enterValue(emailField, Email);
		}
		
		public void enterTelephone (String phoneNumber) {
			WebDriverUtility.enterValue(telephoneField, phoneNumber);
			
		}
		
		
		public void enterPassword(String password) {
			WebDriverUtility.enterValue(passwordField, password);
			
		}
		
		public void enterConfirmPassword(String ConfirmPassword) {
			
			WebDriverUtility.enterValue(confirmPasswordField, ConfirmPassword);
		}
		
		public void Subscribe(String valueOfSubscribe) {
			
			
			if (valueOfSubscribe.equalsIgnoreCase("yes")) {
				
				if (!yesSubscribeButton.isSelected())
				
				WebDriverUtility.clickOnElement(yesSubscribeButton);
				
		
			} else 
				WebDriverUtility.clickOnElement(noSubscribeButton);
			
	
		}
		
		public void checkPrivacyPolicy() {
			
			if (privacyPolicyCheckBox.isDisplayed()) {
				
				privacyPolicyCheckBox.click();
			
			}
			
		}
		
		
		
		public void clickOnContineButton() {
			WebDriverUtility.clickOnElement(continueButton);
			
		}
		
		
		public boolean registerationOutCome() {
			
			boolean successMessage = accountCreatedMessage.isDisplayed();
			return successMessage;
			
			
			
		}
		
		
		
		
}

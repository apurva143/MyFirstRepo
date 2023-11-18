package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
		
		public RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(linkText="Register")
		''
		private WebElement LinkText;
		
		@FindBy(id="gender-female")
		private WebElement Gender;
		
		@FindBy(id="FirstNam=----------e")
		private WebElement Firstname;
		
		@FindBy(id="LastName")
		private WebElement Laststname;
		
		@FindBy(id="Email")
		private WebElement Email;
		
		@FindBy(id="Password")
		private WebElement Password;
		
		@FindBy(id="ConfirmPassword")
		private WebElement Cfmpassword;
		
		@FindBy(id="register-button")
		private WebElement Regbutton;

		public WebElement getLinkText() {
			return LinkText;
		}

		public WebElement getGender() {
			return Gender;
		}

		public WebElement getFirstname() {
			return Firstname;
		}

		public WebElement getLaststname() {
			return Laststname;
		}

		public WebElement getEmail() {
			return Email;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getCfmpassword() {
			return Cfmpassword;
		}

		public WebElement getRegbutton() {
			return Regbutton;
		}
		

	}	



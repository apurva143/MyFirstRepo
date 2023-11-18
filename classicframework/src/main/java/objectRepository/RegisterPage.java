package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
	}
	@FindBy(linkText="Register")
	private WebElement RegLinkText;
	
	@FindBy(id="gender-male")
	private WebElement genderRB;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTF;
	
	@FindBy(id="LastName")
	private WebElement lastNameTF;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement passTF;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confpassTF;
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement regbutton;
	
	
	//**********getters**********//
	public WebElement getRegLinkText() {
		return RegLinkText;
	}
	public WebElement getGenderRB() {
		return genderRB;
	}
	public WebElement getFirstNameTF() {
		return firstNameTF;
	}
	public WebElement getLastNameTF() {
		return lastNameTF;
	}
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPassTF() {
		return passTF;
	}
	public WebElement getConfpassTF() {
		return confpassTF;
	}
	public WebElement getRegbutton() {
		return regbutton;
	}
	
}
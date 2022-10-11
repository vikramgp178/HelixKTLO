package pages.ES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ES_Ocioneo extends BasePage {

	public ES_Ocioneo(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "signin_username")
	private WebElement username;

	@FindBy(id = "signin_password")
	private WebElement password;

	@FindBy(css = "fieldset > input")
	private WebElement loginBtn;

	@FindBy(css = "li:nth-of-type(1) > a > span")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(2) > .col10 > strong")
	private WebElement currentEmailAddress;

	@FindBy(css = ".profile  a")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public void openMyaccount() {
		myAccount.click();
	}

	public String getCurrentEmailID() {
		return currentEmailAddress.getText();
	}

	public void LogoutFromAccount() {
		logout.click();
	}

}
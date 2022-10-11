package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class UK_AmericanExpressIdentityDefence extends BasePage {

	public UK_AmericanExpressIdentityDefence(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "UserName")
	private WebElement username;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(css = "input#signin")
	private WebElement loginBtn;

	@FindBy(css = "div#leftMenu > ul > li:nth-of-type(2) > a")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(3) > .form-span > strong")
	private WebElement currentEmailAddress;

	@FindBy(css = "div#leftMenu > ul > li:nth-of-type(6) > a")
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
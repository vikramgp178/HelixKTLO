package pages.DE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class DE_DatapalMobilComm extends BasePage {

	public DE_DatapalMobilComm(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "signin_username")
	private WebElement username;

	@FindBy(id = "signin_password")
	private WebElement password;

	@FindBy(css = "form[role='form'] > button[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = ".list-inline.list-unstyled.member.pull-right  .track-event")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(2) > p > strong")
	private WebElement currentEmailAddress;

	@FindBy(css = ".list-inline.list-unstyled.member.pull-right  a[title='Log out']")
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
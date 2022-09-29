package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class UK_DatapalFull extends BasePage {

	public UK_DatapalFull(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "signin_username")
	private WebElement username;

	@FindBy(name = "signin_password")
	private WebElement password;

	@FindBy(css = "form[role='form'] > button[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = ".list-inline.list-unstyled.member.pull-right > li:nth-of-type(3) > .track-event")
	private WebElement myAccount;

	@FindBy(css = "div#accordion > div:nth-of-type(3) > .form-control")
	private WebElement currentEmailAddress;
	
	@FindBy(css="a[title='Log out'] > .glyphicon.glyphicon-remove")
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
		return currentEmailAddress.getAttribute("value");
	}
	
	public void LogoutFromAccount() {
		logout.click();
	}


}

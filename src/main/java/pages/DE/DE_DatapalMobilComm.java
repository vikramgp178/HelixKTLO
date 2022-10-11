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

	@FindBy(name = "signin_username")
	private WebElement username;

	@FindBy(name = "signin_password")
	private WebElement password;

	@FindBy(css = "form[role='form'] > button[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = ".list-inline.list-unstyled.member.pull-right  .track-event")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(4) a")
	private WebElement ExpandPanel;

	@FindBy(css = "div#collapseFour > div > div:nth-of-type(3) > .form-control")
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
		ExpandPanel.click();
		System.out.println("panel expanded");
		System.out.println("text captured" + currentEmailAddress.getAttribute("value"));
		return currentEmailAddress.getAttribute("value");
	}

	public void LogoutFromAccount() {
		logout.click();
	}

}
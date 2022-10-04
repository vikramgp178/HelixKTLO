package pages.DE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class DE_Datapal1_5 extends BasePage {

	public DE_Datapal1_5(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "signinEmail")
	private WebElement username;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(css = "button[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = "pull-right > a:nth-of-type(1)")
	private WebElement myAccount;

	@FindBy(css = "div#accordion > div:nth-of-type(3) > .form-control")
	private WebElement currentEmailAddress;
	
	@FindBy(css = ".col-md-12.hidden-sm.hidden-xs.secondary-nav.secondary-nav__member  a[title='Log out']")
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
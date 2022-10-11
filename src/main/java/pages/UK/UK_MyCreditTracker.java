package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class UK_MyCreditTracker extends BasePage {

	public UK_MyCreditTracker(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(css = "input[title='Sign in']")
	private WebElement loginBtn;

	@FindBy(css = "a#myaccount > span")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(2) > p > strong")
	private WebElement currentEmailAddress;

	@FindBy(css = "a[title='Sign out'] > span")
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

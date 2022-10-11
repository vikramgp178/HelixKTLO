package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class UK_ManageMyCredit extends BasePage {

	public UK_ManageMyCredit(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Username")
	private WebElement username;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(css = "input[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = "h3:nth-of-type(1) > a[title='Expand/Collapse'] > span")
	private WebElement myAccount;

	@FindBy(css = "a[title='View account profile'] .bgcolor")
	private WebElement viewAccountProfile;

	@FindBy(css = "div:nth-of-type(2) > .profileinput > .input.readonly > .readonlytxt")
	private WebElement currentEmailAddress;

	@FindBy(id = "fancybox-close")
	private WebElement closeMyProfileBtn;

	@FindBy(css = "a[title='Log out'] > .submitbtn_Logout")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public void openMyaccount() {
		myAccount.click();
		viewAccountProfile.click();

	}

	public String getCurrentEmailID() {
		driver.switchTo().frame("fancybox-frame");
		return currentEmailAddress.getText();
	}

	public void closeMyProfile() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		closeMyProfileBtn.click();

	}

	public void LogoutFromAccount() {
		logout.click();
	}

}

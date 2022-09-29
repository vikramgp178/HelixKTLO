package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class UK_CreditTrackerIdentiy_Vanquis extends BasePage {

	public UK_CreditTrackerIdentiy_Vanquis(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = ".site-navbar-primary--loggedout .button--default")
	private WebElement signInBtn;
	
	@FindBy(id = "UserName")
	private WebElement username;

	@FindBy(id = "Password")
	private WebElement password;
	

	@FindBy(css = "button[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = ".site-navbar-primary__item__link-profile")
	private WebElement myAccount;
	
	@FindBy(css = ".hidden-xs.site-navbar-primary  .dropdown-menu > li:nth-of-type(1) > a")
	private WebElement personalInfo;

	@FindBy(css = "input#MemberNumber")
	private WebElement currentEmailAddress;
	
	@FindBy(css=".site-navbar-primary__item--signout .button--default")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		signInBtn.click();
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public void openMyaccount() {
		myAccount.click();
		personalInfo.click();
	}

	public String getCurrentEmailID() {
		return currentEmailAddress.getAttribute("value");
	}
	
	public void LogoutFromAccount() {
		logout.click();
	}

}

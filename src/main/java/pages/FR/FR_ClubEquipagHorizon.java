package pages.FR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class FR_ClubEquipagHorizon extends BasePage {

	public FR_ClubEquipagHorizon(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "textfield")
	private WebElement username;

	@FindBy(css = "div#partialsubmit > input")
	private WebElement loginBtn;

	@FindBy(css = "div#navfooter > a:nth-of-type(4)")
	private WebElement myAccount;

	@FindBy(css = "input#MemberNumber")
	private WebElement currentEmailAddress;

	@FindBy(css = ".logout > a")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);

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
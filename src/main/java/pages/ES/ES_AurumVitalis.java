package pages.ES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ES_AurumVitalis extends BasePage {

	public ES_AurumVitalis(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "signin_username")
	private WebElement username;

	@FindBy(id = "signin_password")
	private WebElement password;

	@FindBy(css = "button[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(css = ".fs14.loggedin.pull-left > .list-inline-logged > li:nth-of-type(1) > a")
	private WebElement myAccount;

	@FindBy(css = "input#Email")
	private WebElement currentEmailAddress;

    @FindBy(css = ".logout > a[title='Log out']")
    private WebElement logout;A

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
package pages.ES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class ES_DisfrutayAhorra extends BasePage {

	public ES_DisfrutayAhorra(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "signin_username")
	private WebElement username;

	@FindBy(id = "signin_password")
	private WebElement password;

	@FindBy(css = "fieldset > input")
	private WebElement loginBtn;

	@FindBy(css = ".clearfix > li:nth-of-type(3) > a")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(4) > strong")
	private WebElement currentEmailAddress;

	@FindBy(css = ".login.mem-login ul a")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public void openMyaccount() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) myAccount));
		myAccount.click();
	}

	public String getCurrentEmailID() {
		return currentEmailAddress.getText();
	}

	public void LogoutFromAccount() {
		logout.click();
	}

}
package pages.FR;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class FR_SosOpposition extends BasePage {

	public FR_SosOpposition(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(css = "input[value='Continuer']")
	private WebElement loginBtn;

	@FindBy(id = "SL_place1")
	private WebElement passcode1;

	@FindBy(id = "SL_place2")
	private WebElement passcode2;

	@FindBy(id = "SL_place3")
	private WebElement passcode3;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement enterPasscode;

	@FindBy(css = "li:nth-of-type(1) > h3 > a")
	private WebElement myAccount;

	@FindBy(css = "div:nth-of-type(1) > .prefilled")
	private WebElement currentEmailAddress;

	@FindBy(css = ".logout > a")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public void selectEnterPassCode() throws InterruptedException {
		selectValueFromDropdown(passcode1, "A");
		selectValueFromDropdown(passcode2, "A");
		selectValueFromDropdown(passcode3, "A");

		enterPasscode.click();
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
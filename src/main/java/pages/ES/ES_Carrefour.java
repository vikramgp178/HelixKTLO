package pages.ES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ES_Carrefour extends BasePage {

	public ES_Carrefour(WebDriver driver) {
		super(driver);
// TODO Auto-generated constructor stub
	}

	@FindBy(id = "UserName")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(css = "input[name='signin_submit']")
	private WebElement loginBtn;

	@FindBy(id = "SL_place1")
	private WebElement passcode1;

	@FindBy(id = "SL_place2")
	private WebElement passcode2;

	@FindBy(id = "SL_place3")
	private WebElement passcode3;

	@FindBy(css = "input[name='secondaryLogon_submit']")
	private WebElement enterPasscode;

	@FindBy(css = "ul#leftNav  a[title='Mi Perfil']")
	private WebElement myAccount;

	@FindBy(css = "input#email")
	private WebElement currentEmailAddress;

	@FindBy(css = "a[title='Desconectar']")
	private WebElement logout;

	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public void selectEnterPassCode() {
		selectValueFromDropdown(passcode1, "A");
		selectValueFromDropdown(passcode2, "A");
		selectValueFromDropdown(passcode3, "A");
		enterPasscode.click();
	}

	public void openMyaccount() {
		myAccount.click();
	}

	public void verifyPasscode() {
		myAccount.click();
	}

	public String getCurrentEmailID() {
		return currentEmailAddress.getAttribute("value");
	}

	public void LogoutFromAccount() {
		logout.click();
	}

}
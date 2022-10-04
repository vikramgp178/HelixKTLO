package testcases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DE.DE_Datapal1_5;
import pages.DE.DE_Uniqa;
import pages.ES.ES_Disfrutamaspormenos;
import pages.ES.ES_DisfrutayAhorra;
import pages.ES.ES_Ocioneo;
import pages.UK.UK_AmericanExpressIdentityDefence;
import pages.UK.UK_CreditTrackerIdentiy_Vanquis;
import pages.UK.UK_DatapalFull;
import pages.UK.UK_IdentitySecure;
import pages.UK.UK_ManageMyCredit;
import pages.UK.UK_MyCreditMonitor;
import pages.UK.UK_MyCreditTracker;
import pages.UK.UK_PrivacyGuard;
import pages.UK.UK_SentinelGold;
import utilities.DataUtil;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SanityTest extends BaseTest {
	
	@Epic("Epic - User Actions Login and Registration")
	@Feature("Feature -UserFlows ")
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void sanityTest(String applicationName, String url, String browserName, String username, String password,
			String runmode) throws InterruptedException {

		/*
		 * System.out.println("Browsername="+browserName+" and URL :"+url
		 * +" and username :"+username +" and password :"+password
		 * +" and runmode :"+runmode );
		 */

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (applicationName.equals("My Credit Monitor")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			UK_MyCreditMonitor home = new UK_MyCreditMonitor(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			checkBrokenlinks(url);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Privacy Guard UK")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Manage my credit")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_ManageMyCredit home = new UK_ManageMyCredit(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.closeMyProfile();
			home.LogoutFromAccount();

		} else if (applicationName.equals("Identity Secure")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			///System.out.println("Privacy Guard UK");
			UK_IdentitySecure home = new UK_IdentitySecure(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("(Vanquis) Credit Tracker Identiy")) {
			checkRunmode(runmode);
			setUp(browserName, url);
		//	System.out.println("Privacy Guard UK");
			UK_CreditTrackerIdentiy_Vanquis home = new UK_CreditTrackerIdentiy_Vanquis(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
		//	System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), "4007525571");
			home.LogoutFromAccount();

		} else if (applicationName.equals("My Credit Tracker")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_MyCreditTracker home = new UK_MyCreditTracker(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("American Express Identity Defence")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}
		else if (applicationName.equals("Datapal Full UK")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_DatapalFull home = new UK_DatapalFull(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("SENTINELGOLD")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_SentinelGold home = new UK_SentinelGold(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Carrefour")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Sos Opposition")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Club Horizon (BPSO)")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Club Equipage (BPSO)")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Ocioneo")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			ES_Ocioneo home = new ES_Ocioneo(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("DisfrutayAhorra")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			ES_DisfrutayAhorra home = new ES_DisfrutayAhorra(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Disfrutamaspormenos (Leisure_Time)")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			ES_Disfrutamaspormenos home = new ES_Disfrutamaspormenos(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Uniqa")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			DE_Uniqa home = new DE_Uniqa(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "UQ4000291093");
			home.LogoutFromAccount();

		}else if (applicationName.equals("Datapal 1.5")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			DE_Datapal1_5 home = new DE_Datapal1_5(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "4009372791");
			home.LogoutFromAccount();

		}else if (applicationName.equals("Datapal MobilComm")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Vitalisbienestar")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("AurumVitalis")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Consejero legal")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Miasesor")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Seguro")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}else if (applicationName.equals("Datapal Turkey")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			//System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}

	}

}

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
import pages.DE.DE_DatapalMobilComm;
import pages.DE.DE_Uniqa;
import pages.ES.ES_AurumVitalis;
import pages.ES.ES_Carrefour;
import pages.ES.ES_Disfrutamaspormenos;
import pages.ES.ES_DisfrutayAhorra;
import pages.ES.ES_Ocioneo;
import pages.ES.ES_Vitalisbienestar;
import pages.FR.FR_ClubEquipagHorizon;
import pages.FR.FR_ClubEquipage;
import pages.FR.FR_SosOpposition;
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

public class QASanityTest extends BaseTest {

	@Epic("Epic - User Actions Login and Registration")
	@Feature("Feature -UserFlows ")
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void qaSanityTest(String applicationName, String url, String browserName, String username, String password,
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
			//1.
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// checkBrokenlinks(url);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Privacy Guard UK")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			//2.
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Manage my credit")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_ManageMyCredit home = new UK_ManageMyCredit(driver);
			home.LogIn_Action(username, password);
			
			//3.
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.closeMyProfile();
			home.LogoutFromAccount();

		} else if (applicationName.equals("Identity Secure")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			//4.
			/// System.out.println("Privacy Guard UK");
			UK_IdentitySecure home = new UK_IdentitySecure(driver);
			home.LogIn_Action(username, password);
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("(Vanquis) Credit Tracker Identiy")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			//5
			// System.out.println("Privacy Guard UK");
			UK_CreditTrackerIdentiy_Vanquis home = new UK_CreditTrackerIdentiy_Vanquis(driver);
			home.LogIn_Action(username, password);
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), "4007525571");
			home.LogoutFromAccount();

		} else if (applicationName.equals("My Credit Tracker")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_MyCreditTracker home = new UK_MyCreditTracker(driver);
			home.LogIn_Action(username, password);
			//6
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("American Express Identity Defence")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_AmericanExpressIdentityDefence home = new UK_AmericanExpressIdentityDefence(driver);
			home.LogIn_Action(username, password);
			//7
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Datapal Full UK")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_DatapalFull home = new UK_DatapalFull(driver);
			home.LogIn_Action(username, password);
			//8
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("SENTINELGOLD")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			UK_SentinelGold home = new UK_SentinelGold(driver);
			home.LogIn_Action(username, password);
			//9
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Carrefour")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("step1 browser URL : " + browserName + " and " + url);
			ES_Carrefour home = new ES_Carrefour(driver);
			home.LogIn_Action(username, password);
			home.selectEnterPassCode();
			//10
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Sos Opposition")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			FR_SosOpposition home = new FR_SosOpposition(driver);
			home.LogIn_Action(username, password);
			//11
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.selectEnterPassCode();
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "4005950298");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Club Equipage Horizon (BPSO)")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			FR_ClubEquipagHorizon home = new FR_ClubEquipagHorizon(driver);
			home.LogIn_Action(username, password);
			//12
			home.openMyaccount();
			Assert.assertEquals(home.getCurrentEmailID(), "57319155665");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Club Equipage (BPSO)")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			FR_ClubEquipage home = new FR_ClubEquipage(driver);
			home.LogIn_Action(username, password);
			//13
			home.openMyaccount();
			Assert.assertEquals(home.getCurrentEmailID(), "06101800103");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Ocioneo")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			ES_Ocioneo home = new ES_Ocioneo(driver);
			home.LogIn_Action(username, password);
			//14
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("DisfrutayAhorra")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			ES_DisfrutayAhorra home = new ES_DisfrutayAhorra(driver);
			home.LogIn_Action(username, password);
			//15
			home.openMyaccount();
			Assert.assertEquals(home.getCurrentEmailID(), "4005841391");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Disfrutamaspormenos_Leisure_Time")) {
			//16
			checkRunmode(runmode);
			setUp(browserName, url);
			ES_Disfrutamaspormenos home = new ES_Disfrutamaspormenos(driver);
			home.LogIn_Action(username, password);
			home.openMyaccount();
			Assert.assertEquals(home.getCurrentEmailID(), "4004556250");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Uniqa")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			DE_Uniqa home = new DE_Uniqa(driver);
			home.LogIn_Action(username, password);
			//17
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "UQ4000291093");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Datapal 1.5")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			DE_Datapal1_5 home = new DE_Datapal1_5(driver);
			home.LogIn_Action(username, password);
			//18
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "4009372791");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Datapal MobilComm")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			DE_DatapalMobilComm home = new DE_DatapalMobilComm(driver);
			home.LogIn_Action(username, password);
			//19
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "4009622542.0");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Vitalisbienestar")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			Assert.assertTrue(getTitle().contains("Vitalis Bienestar"), "Partially matched");

		} else if (applicationName.equals("AurumVitalis")) {
			checkRunmode(runmode);
			setUp(browserName, url);

			ES_AurumVitalis home = new ES_AurumVitalis(driver);
			home.LogIn_Action(username, password);
			//21
			// System.out.println("User loggin into the :" + applicationName + " with
			// Username :" + username);
			home.openMyaccount();
			// System.out.println("received form home" + home.getCurrentEmailID() + " from
			// xls " + username);
			Assert.assertEquals(home.getCurrentEmailID(), "Mi Perfil");
			home.LogoutFromAccount();

		} else if (applicationName.equals("Consejero legal")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			Assert.assertEquals(getTitle(),"Consejero Legal" );
			

		} else if (applicationName.equals("Miasesor")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			Assert.assertEquals(getTitle(),"MiAsesor - Home" );
			

		} else if (applicationName.equals("Seguro")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			Assert.assertEquals(getTitle(),"SeguroyProtegido - Home" );
			

		} else if (applicationName.equals("Datapal Turkey")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			Assert.assertTrue(getTitle().contains("DataPal, internette bilgilerinizi"), "Partially matched");
			
		}

	}

}
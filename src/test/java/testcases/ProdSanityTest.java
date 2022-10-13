package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UK.UK_PrivacyGuard;
import utilities.DataUtil;

public class ProdSanityTest extends BaseTest {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void prodSanityTest(String url, String browsername, String title, String runmode) {
		// System.out.println("browser :"+browsername+" and url is: "+url);
		checkRunmode(runmode);
		setUp(browsername, url);
		//Assert.assertEquals(getPageTitle(), title);
		checkSoftAsserEqual(getPageTitle(), title);
		tearDown();
	}

}

package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UK.UK_PrivacyGuard;
import utilities.DataUtil;

public class PreProd1gTest extends BaseTest {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void PreProd1gTest(String url,String browsername, String title,String runmode) {
		
		//System.out.println("browser :"+browsername+" and url is: "+url +" run mode :"+runmode+" page title "+ title);
		if (runmode.equals("Y")) {
		    setUp(browsername,url);
			//Assert.assertEquals(actual,expected);
		    checkSoftAsserEqual(getPageTitle(),title);
		    tearDown();
			//SampleMethod();
			//System.out.println("assert done");
	
		}else if(runmode.equals("N")) {
		     throw new SkipException("Test iteration is Skipped as Runmode is :"+runmode);
		}else {
			System.out.println("Run mode not found");
		}
		
	}
	
	
}

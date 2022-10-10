package extentlisteners;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class CustomListeners implements ITestListener{
	
	WebDriver driver;
	public InputStream ins;
	public static Allure allure;
	static Date d = new Date();
	static String fileName ="\\Failed_Screenshot_" + d.toString().replace(":", "_").replace(" ", "_")+ ".jpg";
	static String path =  System.getProperty("user.dir")+fileName;
//	static String fileName = "V2E_Test_Report_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

	/*private static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "\\target\\reports\\" + fileName);*/
	
	
	public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub		
	/*	String param = (String) ((ITestResult) arg0).getParameters()[0];
		allure = Allure*/

        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	
		try {
			
			//ins = new FileInputStream(path);
			
			System.out.println("*** Test execution " + arg0.getMethod().getMethodName() + " failed...");
			System.out.println(arg0.getMethod().getMethodName() + " failed!");

			ITestContext context = arg0.getTestContext();
			driver = (WebDriver) context.getAttribute("driver");

			// attach screenshots to report
			saveFailureScreenShot(driver);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Allure.attachment("Screenshot", ins); 		
    }		

    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
    
    @Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}

}

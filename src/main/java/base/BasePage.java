package base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	
	
	
	public static WebDriver driver;
	public static CarBase car;
	
	
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver; //DriverManager.getDriver();
		car = new CarBase(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectValueFromDropdown(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
	
/*	public void WaitVisibilityOfElementLocated(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}*/

	public boolean isElementPresent(WebElement webelement) {
		
		  try {
		    if(isElementPresent(webelement)==true) {
		    	System.out.println("element exist");
		    }
		  } catch (NoSuchElementException e) {
		    System.out.println("Element not found");
		  }
		  return true;
		}
		
	

	public void click(WebElement element) {
		
		element.click();
		
		//extent log
	}
	

}

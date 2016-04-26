package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout_Page extends Page_BaseClass{
	public static WebElement lnk_LogOutByLnkTxt(WebDriver driver){
		return driver.findElement(By.linkText("Logout"));
	}
	
	public static WebElement lnk_ReLoginByLnkTxt(WebDriver driver){
		return driver.findElement(By.linkText("Click here to login again"));
	}
	
	
}

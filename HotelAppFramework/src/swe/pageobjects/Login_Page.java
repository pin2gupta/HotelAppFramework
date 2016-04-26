package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	public static WebElement lnk_Build2ByLinkTxt(WebDriver driver){
		return driver.findElement(By.linkText("Go to Build 2"));
	}
	
	public static WebElement txtbx_UserNameByID(WebDriver driver){
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement txtbx_UserNameByName(WebDriver driver){
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement txtbx_UserNameByClassName(WebDriver driver){
		return driver.findElement(By.id("login_input"));
	}
	
	public static WebElement txtbx_UserNameByTagName(WebDriver driver){
		return driver.findElement(By.tagName("input"));
	}
	
	public static WebElement txtbx_PwdByID(WebDriver driver){
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement txtbx_PwdByName(WebDriver driver){
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement bttn_LoginById(WebDriver driver){
		return driver.findElement(By.id("login"));
	}
	
	//After Login String
	public static String txt_AfterLoginByID(WebDriver driver){
		return driver.findElement(By.id("username_show")).getAttribute("value");
	}
}

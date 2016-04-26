package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePwd_Page {
	public static WebElement txt_CurrentPwdByName(WebDriver driver){
		return driver.findElement(By.name("current_pass"));
	}
	
	public static WebElement txt_NewPwdByName(WebDriver driver){
		return driver.findElement(By.name("new_password"));
	}
	
	public static WebElement txt_ConfirmPwdByName(WebDriver driver){
		return driver.findElement(By.name("re_password"));
	}
}

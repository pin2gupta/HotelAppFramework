package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header_Links {
	
	public static WebElement lnk_BookedItineraryByTxt(WebDriver driver){
		return driver.findElement(By.linkText("Booked Itinerary"));
	}
	
	public static WebElement lnk_ChangedPwdByTxt(WebDriver driver){
		return driver.findElement(By.linkText("Change Password"));
	}
	
	
	public static WebElement lnk_SearchHotelByTxt(WebDriver driver){
		return driver.findElement(By.linkText("Search Hotel"));
	}
	
	public static WebElement lnk_LogOutByTxt(WebDriver driver){
		return driver.findElement(By.linkText("Logout"));
	}
}

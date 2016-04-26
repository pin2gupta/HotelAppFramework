package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Book_Hotel_Page {
	
	//Disabled Text
	public static WebElement txt_HotelNameById(WebDriver driver){
		return driver.findElement(By.id("hotel_name_dis"));
	}

	public static WebElement txt_LocationById(WebDriver driver){
		return driver.findElement(By.id("location_dis"));
	}
	
	public static WebElement txt_RoomTypeById(WebDriver driver){
		return driver.findElement(By.id("room_type_dis"));
	}
	
	public static WebElement txt_RoomNumById(WebDriver driver){
		return driver.findElement(By.id("room_num_dis"));
	}
	
	public static WebElement txt_TotalDaysById(WebDriver driver){
		return driver.findElement(By.id("total_days_dis"));
	}
	
	public static WebElement txt_PricePerNightById(WebDriver driver){
		return driver.findElement(By.id("price_night_dis"));
	}
	
	public static WebElement txt_TotalPriceById(WebDriver driver){
		return driver.findElement(By.id("total_price_dis"));
	}
	
	public static WebElement txt_GSTById(WebDriver driver){
		return driver.findElement(By.id("gst_dis"));
	}
	
	public static WebElement txt_FinalBillerPriceById(WebDriver driver){
		return driver.findElement(By.id("final_price_dis"));
	}
	
	//Enter Text
	public static WebElement txtbx_FirstNameById(WebDriver driver){
		return driver.findElement(By.id("first_name"));
	}
	
	public static WebElement txtbx_LastNameById(WebDriver driver){
		return driver.findElement(By.id("last_name"));
	}
	
	public static WebElement txtbx_BillingAddressById(WebDriver driver){
		return driver.findElement(By.id("address"));
	}
	
	public static WebElement txtbx_CreditCardNoById(WebDriver driver){
		return driver.findElement(By.id("cc_num"));
	}
	
	public static Select sel_CreditCardTypeById(WebDriver driver){
		return new Select(driver.findElement(By.id("cc_type")));
	}
	
	public static Select sel_ExpMonById(WebDriver driver){
		return new Select(driver.findElement(By.id("cc_exp_month")));
	}
	
	public static Select sel_ExpYearById(WebDriver driver){
		return new Select(driver.findElement(By.id("cc_exp_year")));
	}
	
	public static WebElement txtbx_CVVNumById(WebDriver driver){
		return driver.findElement(By.id("cc_cvv"));
	}
	
	//Button
	public static WebElement bttn_BookNowById(WebDriver driver){
		return driver.findElement(By.id("book_now"));
	}
	
	public static WebElement bttn_CancelById(WebDriver driver){
		return driver.findElement(By.id("cancel"));
	}
	
	//Messages
	public static String msg_EntFNameEmptyByid(WebDriver driver){
		return driver.findElement(By.id("first_name_span")).getText();
	}
	
	public static String msg_EntLNameEmptyByid(WebDriver driver){
		return driver.findElement(By.id("last_name_span")).getText();
	}
	
	public static String msg_EntAddEmptyByid(WebDriver driver){
		return driver.findElement(By.id("address_span")).getText();
	}
	
	public static String msg_EntCrdCarNoByid(WebDriver driver){
		return driver.findElement(By.id("cc_num_span")).getText();
	}
	
	public static String msg_EntCrdCarTypeByid(WebDriver driver){
		return driver.findElement(By.id("cc_type_span")).getText();
	}
	
	public static String msg_SelMonYrByid(WebDriver driver){
		return driver.findElement(By.id("cc_expiry_span")).getText();
	}
	
	public static String msg_EntCVVByid(WebDriver driver){
		return driver.findElement(By.id("cc_cvv_span")).getText();
	}
}

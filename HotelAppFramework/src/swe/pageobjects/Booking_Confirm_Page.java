package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Booking_Confirm_Page {
	public static WebElement txt_HotelNameById(WebDriver driver){
		return driver.findElement(By.id("hotel_name"));
	}

	public static WebElement txt_LocationById(WebDriver driver){
		return driver.findElement(By.id("location"));
	}
	
	public static WebElement txt_RoomTypeById(WebDriver driver){
		return driver.findElement(By.id("room_type"));
	}
	
	public static WebElement txt_ArrDateById(WebDriver driver){
		return driver.findElement(By.id("arrival_date"));
	}
	
	public static WebElement txt_DepDateByName(WebDriver driver){
		return driver.findElement(By.id("departure_text"));
	}
	
	public static WebElement txt_TotalRoomsById(WebDriver driver){
		return driver.findElement(By.id("total_rooms"));
	}
	
	public static WebElement txt_AdultsPerRoomById(WebDriver driver){
		return driver.findElement(By.id("adults_room"));
	}
	
	
	public static WebElement txt_ChildPerRoomById(WebDriver driver){
		return driver.findElement(By.id("children_room"));
	}
	
	public static WebElement txt_PricePerNightById(WebDriver driver){
		return driver.findElement(By.id("price_night"));
	}
	
	public static WebElement txt_TotalPriceById(WebDriver driver){
		return driver.findElement(By.id("total_price"));
	}
	
	public static WebElement txt_GSTById(WebDriver driver){
		return driver.findElement(By.id("gst"));
	}
	
	
	public static WebElement txt_FinalBillerPriceById(WebDriver driver){
		return driver.findElement(By.id("final_price"));
	}
	
	public static WebElement txtbx_FirstNameById(WebDriver driver){
		return driver.findElement(By.id("first_name"));
	}
	
	public static WebElement txtbx_LastNameById(WebDriver driver){
		return driver.findElement(By.id("last_name"));
	}
	
	public static WebElement txtbx_BillingAddressById(WebDriver driver){
		return driver.findElement(By.id("address"));
	}
	
	public static WebElement txt_OrderNumById(WebDriver driver){
		return driver.findElement(By.id("order_no"));
	}
		
	public static WebElement bttn_MyItineraryById(WebDriver driver){
		return driver.findElement(By.id("my_itinerary"));
	}
	
	public static WebElement bttn_SearchHotelById(WebDriver driver){
		return driver.findElement(By.id("search_hotel"));
	}
	
	public static WebElement bttn_LogoutById(WebDriver driver){
		return driver.findElement(By.id("logout"));
	}
	
	
	
	
}

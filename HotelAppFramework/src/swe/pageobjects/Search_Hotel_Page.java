package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel_Page {
	//select Locations
	public static Select selBx_LocationByID(WebDriver driver){
		return new Select(driver.findElement(By.id("location")));
	}
	
	public static Select selBx_LocationByName(WebDriver driver){
		return new Select(driver.findElement(By.name("location")));
	}
	
	//select Hotels
	public static Select selBx_HotelsByID(WebDriver driver){
		return new Select(driver.findElement(By.id("hotels")));
	}
	
	public static Select selBx_HotelsByName(WebDriver driver){
		return new Select(driver.findElement(By.name("hotels")));
	}
	
	//Select Room Type
	public static Select selBx_RoomTypeByID(WebDriver driver){
		return new Select(driver.findElement(By.id("room_type")));
	}

	
	//Select Number of Rooms
	public static Select selBx_RoomsNumByID(WebDriver driver){
		return new Select(driver.findElement(By.id("room_nos")));
	}

	
	//Type in Checkin Date
	public static WebElement txtbx_CheckInDateByID(WebDriver driver){
		return driver.findElement(By.id("datepick_in"));
	}

	
	//Type in Checkout Date
	public static WebElement txtbx_CheckOutDateByID(WebDriver driver){
		return driver.findElement(By.id("datepick_out"));
	}

	
	//Select Adults per Room
	public static Select selBx_AdultPerRoomByID(WebDriver driver){
		return new Select(driver.findElement(By.id("adult_room")));
	}
	
	//Select Children per Room
	public static Select selBx_ChildPerRoomByID(WebDriver driver){
		return new Select(driver.findElement(By.id("child_room")));
	}
	public static Select selBx_ChildPerRoomByName(WebDriver driver){
		return new Select(driver.findElement(By.name("child_room")));
	}

	
	//Submit
	public static WebElement bttn_SubmitById(WebDriver driver){
		return driver.findElement(By.id("Submit"));
	}
	
	//Reset
	public static WebElement bttn_ResetById(WebDriver driver){
		return driver.findElement(By.id("Reset"));
	}
	
	//Messages
	public static String msg_SelLocByid(WebDriver driver){
		return driver.findElement(By.id("location_span")).getText();
	}
	
	public static String msg_SelTotNumRmsByid(WebDriver driver){
		return driver.findElement(By.id("num_room_span")).getText();
	}
	
	public static String msg_ChkInDateByid(WebDriver driver){
		return driver.findElement(By.id("checkin_span")).getText();
	}
	
	public static String msg_ChkOutDateByid(WebDriver driver){
		return driver.findElement(By.id("checkout_span")).getText();
	}
	
	public static String msg_SelAdultPerRmByid(WebDriver driver){
		return driver.findElement(By.id("adults_room_span")).getText();
	}
	
	//link Search Hotel
	public static WebElement lnk_SearchHotByid(WebDriver driver){
		return driver.findElement(By.linkText("Search Hotel"));
	}
}

package swe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Hotel_Page {
	public static WebElement chkBx_SelectById(WebDriver driver){
		//return driver.findElement(By.xpath("//input[@type='checkbox' and starts-with(@id,'radiobutton_')]"));
		//*[@id="select_form"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		return driver.findElement(By.id("radiobutton_0"));
	}
	
	public static WebElement txt_HotelName(WebDriver driver){
		return driver.findElement(By.id("hotel_name_0"));
	}
	
	public static WebElement txt_Location(WebDriver driver){
		return driver.findElement(By.id("location_0"));
	}
	
	public static WebElement txt_Rooms(WebDriver driver){
		return driver.findElement(By.id("rooms_0"));
	}
	
	public static WebElement txt_ArrDate(WebDriver driver){
		return driver.findElement(By.id("arr_date_0"));
	}
	
	public static WebElement txt_DepDate(WebDriver driver){
		return driver.findElement(By.id("dep_date_0"));
	}
	
	public static WebElement txt_NoDays(WebDriver driver){
		return driver.findElement(By.id("no_days_0"));
	}
	
	public static WebElement txt_RoomType(WebDriver driver){
		return driver.findElement(By.id("room_type_0"));
	}
	
	public static WebElement txt_PricePerNight(WebDriver driver){
		return driver.findElement(By.id("price_night_0"));
	}
	
	public static WebElement txt_TotalPrice(WebDriver driver){
		return driver.findElement(By.id("total_price_0"));
	}
	
	//Buttons
	public static WebElement butt_Continue(WebDriver driver){
		return driver.findElement(By.id("continue"));
	}
	
	public static WebElement butt_Cancle(WebDriver driver){
		return driver.findElement(By.id("cancel"));
	}
	
	//Messages
	public static String msg_SelAHotByid(WebDriver driver){
		return driver.findElement(By.id("radiobutton_span")).getText();
	}
	
}

package swe.testsuites;

import java.util.concurrent.TimeUnit;

import swe.testcases.TC0002_SearchHotel;
import swe.testcases.TC0003_SelectHotel;
import swe.testcases.TC0004_Book_Hotel;
import swe.testcases.TC0005_BookingConfirmation;
import swe.testcases.TC0006_MyItinerary;

public class TestSuite_BookTicket extends TestSuite_BaseClass{
	public static void main(String args[]) throws Exception{
		initialize_Site();	
		
		loginToSite("Test_Data1");
				 
		 //Select Hotel Basic Flow
		 TC0002_SearchHotel serachHotel_BasicFlowTC = new TC0002_SearchHotel(driver1);
		 serachHotel_BasicFlowTC.searchHotel_BasicFlow();
		 driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		//First check the value and then select Hotel
		 TC0003_SelectHotel selectHotel_BasicFlowTC = new TC0003_SelectHotel(driver1);
		 selectHotel_BasicFlowTC.SelectHotel_BasicFlow();
		 driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		//Book A Hotel Page
		 TC0004_Book_Hotel book_HotelTC = new TC0004_Book_Hotel(driver1);
		 book_HotelTC.Book_Hotel_BasicFlow();
		 driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 
		//confirm Booking Hotel Page
		 TC0005_BookingConfirmation booking_confirm = new TC0005_BookingConfirmation(driver1);
		 booking_confirm.Booking_confirmation_BasicFlow();
		 //driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 //Thread.sleep(10000);
		 
		 //MyIternary check and list items
		 TC0006_MyItinerary myItinerary_BasicFlow = new TC0006_MyItinerary(driver1);
		 myItinerary_BasicFlow.MyItinerary_BasicFlow();
		 driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 logoutToSite();
		 
	}
}

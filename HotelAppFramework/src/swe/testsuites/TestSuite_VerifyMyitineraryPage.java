package swe.testsuites;

import swe.testcases.TC0002_SearchHotel;
import swe.testcases.TC0003_SelectHotel;
import swe.testcases.TC0004_Book_Hotel;
import swe.testcases.TC0005_BookingConfirmation;
import swe.testcases.TC0006_MyItinerary;

public class TestSuite_VerifyMyitineraryPage extends TestSuite_BaseClass{
	public static void main(String args[]) throws Exception{
		initialize_Site();
		loginToSite("Test_Data1");
	
		 //Select Hotel Basic Flow
		 TC0002_SearchHotel serachHotel_BasicFlowTC = new TC0002_SearchHotel(driver1);
		 serachHotel_BasicFlowTC.searchHotel_BasicFlow();
			 
		//First check the value and then select Hotel
		 TC0003_SelectHotel selectHotel_BasicFlowTC = new TC0003_SelectHotel(driver1);
		 selectHotel_BasicFlowTC.SelectHotel_BasicFlow();
			 
		//Book A Hotel Page
		 TC0004_Book_Hotel book_HotelTC = new TC0004_Book_Hotel(driver1);
		 book_HotelTC.Book_Hotel_BasicFlow();
		 Thread.sleep(10000);
		 
		//confirm Booking Hotel Page
		 TC0005_BookingConfirmation booking_confirm = new TC0005_BookingConfirmation(driver1);
		 booking_confirm.Booking_confirmation_BasicFlow();
		 
		 //MyIternary check and list items
		 TC0006_MyItinerary myItinerary_AltFlow = new TC0006_MyItinerary(driver1);
		 myItinerary_AltFlow.MyItinerary_BasicFlow();
		
		 //TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
		 //Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
		 myItinerary_AltFlow.verifyTitle();		
		 
		 //TC-116 - check whether the booked itinerary reflects the correct information in line with the booking.
		 //Expected - Itinerary should reflect the correct information in line with the booking.
		 //TC-118 - Verify that all the details of newly generated order number in booked itinerary page are correct and match with data during booking.
		 //Expected - All the details in booked itinerary page should be same as those entered during booking
		 myItinerary_AltFlow.verify_AllCorrectInfo();
		 
		 //TC-117 - check whether “search order id” query is working and displaying the relevant details.
		 //Expected - Search Order ID query should display the relevant details for Order ID
		 //myItinerary_AltFlow.verify_SearchCorrectOrderId();
		
		 //myItinerary_AltFlow.verify_SearchInCorrectOrderId();
		 
		 //logoutToSite();
		 
	}
}

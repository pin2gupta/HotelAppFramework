package swe.testsuites;

import swe.testcases.TC0002_SearchHotel;
import swe.testcases.TC0003_SelectHotel;
import swe.testcases.TC0004_Book_Hotel;
import swe.testcases.TC0005_BookingConfirmation;

public class TestSuite_VerifyBookingConfirmationPage extends TestSuite_BaseClass{
	
	public static void main(String args[]) throws Exception{
		
		initialize_Site();
		loginToSite("Test_Data1");
		
		 try {
			 
			 //Search Hotel using Excel Sheet
			 TC0002_SearchHotel searchHot = new TC0002_SearchHotel(driver1);
			 searchHot.searchHotel_BasicFlow();
			 
			 //Select Hotel Basic Flow
			 TC0003_SelectHotel selectHotel_AltFlow = new TC0003_SelectHotel(driver1);
			 selectHotel_AltFlow.SelectHotel_BasicFlow();
			 
			 //Book Hotel
			 TC0004_Book_Hotel bookHotel = new TC0004_Book_Hotel(driver1);
			 bookHotel.Book_Hotel_BasicFlow();
			 
			 TC0005_BookingConfirmation bookconfirm_Alternative = new TC0005_BookingConfirmation(driver1);
			 //bookconfirm_Alternative.Booking_confirmation_BasicFlow();
			 bookconfirm_Alternative.saveBookConfirmation();
		
			 //TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
			 //Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
			 bookconfirm_Alternative.verifyTitle();
			 
			 //TC-111 - check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
			 //Expected Result - Data should be same as selected in previous screen
			 //TC113 - verify whether the data displayed is same as the selected data in Book hotel page
			 //Expected Result - Hotel: hotel Creek ;  Room type: Standard  ; No-of-rooms:2 ; Check-in-date:27/07/2012 ; Checkoutdate:28/07/2012 ;	 No-of-adults:1 ; No-of-children: 0
			
			 bookconfirm_Alternative.verifySameAPrevious();
						 
			 //TC112 - check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
			 //Expected Result - Final billed Price=125+12.5=137.5 in Book a Hotel page
			 bookconfirm_Alternative.verifyFinalPrie();
			 
				 
			 //TC114 - Verify Order number is generated in booking confirmation page
			 //Expected Result - ORDER no should be generated
			 bookconfirm_Alternative.verifyOrdNoGen();
			 
			 //TC115 - verify whether the booked itinerary details are not editable.
			 //Expected Result - Details once accepted should not be editable
			 bookconfirm_Alternative.verifyFieldDisabled();
			 
			 //logoutToSite();
			 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
			
}

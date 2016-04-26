package swe.testsuites;

import swe.testcases.TC0002_SearchHotel;
import swe.testcases.TC0003_SelectHotel;
import swe.testcases.TC0004_Book_Hotel;

public class TestSuite_VerifyBookAHotelPage extends TestSuite_BaseClass{
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
			 
			 TC0004_Book_Hotel bookHotel = new TC0004_Book_Hotel(driver1);
			 
			 //Verify that Hotel Name, Location, Room Type, Number of Rooms, Total Days, 
			 //Price Per Night, Total Price, GST, Final Billed Price is same as in select Hotel Page
			 bookHotel.verifyAllSelectPage();
			 
			 //Verify that Hotel Name, Location, Room Type, Number of Rooms, Total Days, 
			 //Price Per Night, Total Price, GST, Final Billed Price field is disabled
			 bookHotel.verifyAllFieldDisabled();
			 
			 //Check, if Fields are not entered/selected and user clicks Book Now
			 //Expected - a message is selected
			 bookHotel.verifyAllEmpty();
			 
			 //Check is user enters a credit card number less than 16 digits 
			 //Expected - a message is selected
			 //bookHotel.verifyIncorrectCC();
			 
			 //Verify by default a player can not enter text in CVV and Credit Card no. field
			 //bookHotel.verifyStringCVV();
			
			 //Verify the digits are truncated, if user enters a credit card more than 16 digits
			 //bookHotel.verifymoreCCDigits();
			 
			 //TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
			 //Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
			 bookHotel.verifyTitle();
			 
			 //TC-110 - check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
			 //Expected - Total-price should be calculated as (price-per-night*no-of-rooms*no-of-days  Total Price= 125*2*1 = 250$ In book a hotel page
			 bookHotel.verifyTotPrice();
			 
			 logoutToSite();

			 Thread.sleep(6000);
		 }catch (InterruptedException e) {
				e.printStackTrace();
		 }
	}
}

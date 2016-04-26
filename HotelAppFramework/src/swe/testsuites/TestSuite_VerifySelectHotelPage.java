package swe.testsuites;

import swe.testcases.TC0002_SearchHotel;
import swe.testcases.TC0003_SelectHotel;
import swe.utility.PrintMessages;

public class TestSuite_VerifySelectHotelPage extends TestSuite_BaseClass{
	public static void main(String args[]) throws Exception{
		initialize_Site();
		loginToSite("Test_Data1");
		
		//Search Hotel using Excel Sheet
		TC0002_SearchHotel searchHot = new TC0002_SearchHotel(driver1);
		searchHot.searchHotel_BasicFlow();
		
		PrintMessages.printMsg("TestSuite_VerifySelectHotelPage");
		TC0003_SelectHotel selectHotel_AltFlow = new TC0003_SelectHotel(driver1);
		
		//Check if ChekBox is not selected and User selects a Continue button then a message is displayed
			selectHotel_AltFlow.verifyNoChkSel();
			
		 //TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
		 //Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
			selectHotel_AltFlow.verifyTitle();
			
		 // TC-104 - verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
		 //Expected - Location displayed in Select Hotel should be the same as location selected in search hotel form.
			selectHotel_AltFlow.verifyLocDisplayedCorrect();
			
		 // TC-105 - verify whether Check-in date and Check-out date are being displayed in Select Hotel page according to the dates selected in search
		 //Expected - Check-in-date and check-out-date should be displayed according to the data entered in search hotel form.
		 selectHotel_AltFlow.verifyDateDisplayedCorrect();
		 
		 // TC-106 - verify whether no. of rooms in Select Hotel page is same as the Number of rooms selected in search
		 //Expected - No-of-rooms should be displayed and match with number of rooms in search hotel page
		 selectHotel_AltFlow.verifyNoRoomDisplayedCorrect();
		 
		 // TC -107 verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
		 //Expected - Room type displayed should be the same as selected in search hotel page
		 selectHotel_AltFlow.verifyRoomTypeDisplayedCorrect();
		 
		 //TC-108 - verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
		 //Expected - Total price =125*1*2=250$
		 selectHotel_AltFlow.CalculateTotalPrice();
		
		logoutToSite();
	}
}
